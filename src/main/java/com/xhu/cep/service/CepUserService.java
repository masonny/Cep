package com.xhu.cep.service;

import com.xhu.cep.mbg.model.admin.CepProjectPermisson;
import com.xhu.cep.mbg.model.admin.CepUser;

import java.util.List;

/**
 * Created by mason on 2023/4/21
 */
public interface CepUserService {
    /**
     * 根据用户名获取后台管理员
     */
    CepUser getUserByUsername(String username);

    /**
     * 注册功能
     */
    CepUser register(CepUser umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<CepProjectPermisson> getPermissionList(Long adminId);
}
