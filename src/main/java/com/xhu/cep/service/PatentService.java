package com.xhu.cep.service;

import com.xhu.cep.mbg.model.patent.Patent;

import java.util.List;

/**
 * Created by mason on 2023/4/18
 */
public interface PatentService {
    List<Patent> getPatentAllList();
}
