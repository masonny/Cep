package com.xhu.cep.service.impl;

import com.xhu.cep.mbg.mapper.sci_res_papers.SciResPapersMapper;
import com.xhu.cep.mbg.model.sci_res_papers.SciResPapers;
import com.xhu.cep.service.SciResPapersServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mason on 2023/4/18
 */
@Service
public class SciResPapersServieImple implements SciResPapersServie {
    @Autowired
    private SciResPapersMapper sciResPapersMapper;
    @Override
    public List<SciResPapers> getSciResPapersAllList() {
        return sciResPapersMapper.getSciResPapersAllList();
    }
}