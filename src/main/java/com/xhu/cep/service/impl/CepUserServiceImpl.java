package com.xhu.cep.service.impl;

import com.xhu.cep.common.utils.JwtTokenUtil;
import com.xhu.cep.mbg.mapper.admin.CepUserMapper;
import com.xhu.cep.mbg.mapper.admin.CepUserRoleRelationDao;
import com.xhu.cep.mbg.model.admin.CepProjectPermisson;
import com.xhu.cep.mbg.model.admin.CepUser;
import com.xhu.cep.mbg.model.admin.CepUserExample;
import com.xhu.cep.service.CepUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by mason on 2023/4/21
 */
@Service
public class CepUserServiceImpl implements CepUserService {
    @Autowired
    private CepUserMapper cepUserMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private CepUserRoleRelationDao cepUserRoleRelationDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(CepUserServiceImpl.class);

    @Override
    public CepUser getUserByUsername(String username) {
        CepUserExample example = new CepUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<CepUser> userList = cepUserMapper.selectByExample(example);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public CepUser register(CepUser umsAdminParam) {
        CepUser cepUser = new CepUser();
        BeanUtils.copyProperties(umsAdminParam, cepUser);
        cepUser.setCreatedAt(new Date());
        cepUser.setStatus(1);
        //查询是否有相同用户名的用户
        CepUserExample example = new CepUserExample();
        example.createCriteria().andUsernameEqualTo(cepUser.getUsername());
        List<CepUser> umsAdminList = cepUserMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(cepUser.getPassword());
        cepUser.setPassword(encodePassword);
        cepUserMapper.insert(cepUser);
        return cepUser;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public List<CepProjectPermisson> getPermissionList(Long userId) {
        return cepUserRoleRelationDao.getPermissionList(userId);
    }
}
