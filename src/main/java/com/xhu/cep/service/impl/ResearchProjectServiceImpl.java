package com.xhu.cep.service.impl;

import com.xhu.cep.component.JwtAuthenticationTokenFilter;
import com.xhu.cep.mbg.mapper.admin.UserRpMapper;
import com.xhu.cep.mbg.mapper.research_project.ResearchProjectMapper;
import com.xhu.cep.mbg.mapper.research_project.RpClassifiMapper;
import com.xhu.cep.mbg.mapper.research_project.RpProjectSourceMapper;
import com.xhu.cep.mbg.model.admin.UserRp;
import com.xhu.cep.mbg.model.research_project.*;
import com.xhu.cep.service.ResearchProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mason on 2023/4/18
 */
@Service
public class ResearchProjectServiceImpl implements ResearchProjectService {
    @Autowired
    private ResearchProjectMapper researchProjectMapper;
    @Autowired
    private RpClassifiMapper rpClassifiMapper;
    @Autowired
    private RpProjectSourceMapper rpProjectSourceMapper;
    @Autowired
    private UserRpMapper userRpMapper;
    @Autowired
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;

    @Override
    public List<RpClassifi> getRpClassifi() {
        return rpClassifiMapper.selectByExample(new RpClassifiExample());
    }

    @Override
    public List<RpProjectSource> getRpProjectSource(Long rpClassId) {
        ResearchProjectExample researchProjectExample = new ResearchProjectExample();
        researchProjectExample.createCriteria().andClassifiIdEqualTo(rpClassId);
        List<ResearchProject> researchProjects = researchProjectMapper.selectByExample(researchProjectExample);
        List<Long> longs = new ArrayList<>();
        for (ResearchProject r : researchProjects
        ) {
            longs.add(r.getProjSouId());
        }
        RpProjectSourceExample rpProjectSourceExample = new RpProjectSourceExample();
        rpProjectSourceExample.createCriteria().andIdIn(longs);
        return rpProjectSourceMapper.selectByExample(rpProjectSourceExample);
    }

    @Override
    public int apply(Long rpClassId, Long rpProSouId) {
        ResearchProjectExample researchProjectExample = new ResearchProjectExample();
        researchProjectExample.createCriteria()
                .andClassifiIdEqualTo(rpClassId)
                .andProjSouIdEqualTo(rpProSouId);
        List<ResearchProject> researchProjects = researchProjectMapper.selectByExample(researchProjectExample);
        if (researchProjects.size() == 0) {
            //没查找到项目id
            return 1;
        }

        UserRp userRp = new UserRp();
        userRp.setUserId(jwtAuthenticationTokenFilter.getUserId());
        userRp.setResProId(researchProjects.get(0).getId());
        userRp.setStatus(0);
        userRpMapper.insert(userRp);
        return 0;
    }
}
