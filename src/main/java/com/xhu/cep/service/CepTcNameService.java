package com.xhu.cep.service;

import com.xhu.cep.mbg.model.teach_compet.CepTcName;

import java.util.List;

/**
 * Created by mason on 2023/4/14
 */
public interface CepTcNameService {
    List<CepTcName> nameListAll();

    int createTcName(CepTcName cepTcName);

    int upDataTcName(Long id, CepTcName cepTcName);

    int deleteTcName(Long id);

    List<CepTcName> listTcName(int pageNum, int pageSize);

    CepTcName getTcName(Long id);
}
