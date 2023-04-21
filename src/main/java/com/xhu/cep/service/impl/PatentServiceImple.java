package com.xhu.cep.service.impl;

import com.xhu.cep.mbg.mapper.patent.PatentMapper;
import com.xhu.cep.mbg.model.patent.Patent;
import com.xhu.cep.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mason on 2023/4/18
 */
@Service
public class PatentServiceImple implements PatentService {
    @Autowired
    private PatentMapper patentMapper;
    @Override
    public List<Patent> getPatentAllList() {
        return patentMapper.getPatentAllList();
    }
}
