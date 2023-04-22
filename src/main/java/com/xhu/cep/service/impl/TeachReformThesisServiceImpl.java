package com.xhu.cep.service.impl;

import com.xhu.cep.mbg.mapper.teach_reform_thesis.TeachReformThesisMapper;
import com.xhu.cep.mbg.model.teach_reform_thesis.TeachReformThesis;
import com.xhu.cep.mbg.model.teach_reform_thesis.TeachReformThesisExample;
import com.xhu.cep.service.TeachReformThesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mason on 2023/4/17
 */
@Service
public class TeachReformThesisServiceImpl implements TeachReformThesisService {

    @Autowired
    private TeachReformThesisMapper teachReformThesisMapper;
    @Override
    public List<TeachReformThesis> getTeachReformThesisAll() {
        return teachReformThesisMapper.selectByExample(new TeachReformThesisExample());
    }

}
