package com.xhu.cep.service.impl;

import com.xhu.cep.mbg.mapper.transfor_results.TransforResultsMapper;
import com.xhu.cep.mbg.model.transfor_results.TransforResults;
import com.xhu.cep.service.TransforResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mason on 2023/4/18
 */
@Service
public class TransforResultsServiceImple implements TransforResultsService {
    @Autowired
    private TransforResultsMapper transforResultsMapper;
    @Override
    public List<TransforResults> getTransforResultsAllList() {
        return transforResultsMapper.getTransforResultsAllList();
    }
}
