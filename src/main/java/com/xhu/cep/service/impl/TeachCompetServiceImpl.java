package com.xhu.cep.service.impl;

import com.xhu.cep.mbg.mapper.teach_compet.TeachCompetMapper;
import com.xhu.cep.mbg.model.teach_compet.TeachCompet;
import com.xhu.cep.service.TeachCompetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mason on 2023/4/16
 */
@Service
public class TeachCompetServiceImpl implements TeachCompetService {
    @Autowired
    private TeachCompetMapper teachCompetMapper;
    @Override
    public List<TeachCompet> getTeachCompetAll() {
        return teachCompetMapper.getTeachCompetAll();
    }
}
