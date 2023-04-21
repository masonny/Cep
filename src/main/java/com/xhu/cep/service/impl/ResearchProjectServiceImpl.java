package com.xhu.cep.service.impl;

import com.xhu.cep.mbg.mapper.research_project.ResearchProjectMapper;
import com.xhu.cep.mbg.model.research_project.ResearchProject;
import com.xhu.cep.service.ResearchProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mason on 2023/4/18
 */
@Service
public class ResearchProjectServiceImpl implements ResearchProjectService {
    @Autowired
    private ResearchProjectMapper researchProjectMapper;
    @Override
    public List<ResearchProject> getResearchProjectAllList() {
        return researchProjectMapper.getResearchProjectAllList();
    }
}
