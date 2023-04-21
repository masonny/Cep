package com.xhu.cep.mbg.mapper.patent;

import com.xhu.cep.mbg.model.patent.Patent;

import java.util.List;

/**
 * Created by mason on 2023/4/18
 */
public interface PatentMapper {
    List<Patent> getPatentAllList();
}
