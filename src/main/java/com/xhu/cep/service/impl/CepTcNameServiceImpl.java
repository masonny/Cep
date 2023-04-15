package com.xhu.cep.service.impl;

import com.github.pagehelper.PageHelper;
import com.xhu.cep.mbg.mapper.tc.CepTcNameMapper;
import com.xhu.cep.mbg.model.tc.CepTcName;
import com.xhu.cep.mbg.model.tc.CepTcNameExample;
import com.xhu.cep.service.CepTcNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mason on 2023/4/14
 */
@Service
public class CepTcNameServiceImpl implements CepTcNameService {
    @Autowired
    private CepTcNameMapper cepTcNameMapper;
    @Override
    public List<CepTcName> listAllTcName() {
        return cepTcNameMapper.selectByExample(new CepTcNameExample());
    }

    @Override
    public int createTcName(CepTcName cepTcName) {
        return cepTcNameMapper.insertSelective(cepTcName);
    }

    @Override
    public int upDataTcName(Long id, CepTcName cepTcName) {
        cepTcName.setId(id);
        return cepTcNameMapper.updateByPrimaryKeySelective(cepTcName);
    }

    @Override
    public int deleteTcName(Long id) {
       return cepTcNameMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<CepTcName> listTcName(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return cepTcNameMapper.selectByExample(new CepTcNameExample());
    }

    @Override
    public CepTcName getTcName(Long id) {
        return cepTcNameMapper.selectByPrimaryKey(id);
    }
}
