package com.xhu.cep.service;

import com.xhu.cep.mbg.model.research_project.RpClassifi;
import com.xhu.cep.mbg.model.research_project.RpProjectSource;

import java.util.List;

/**
 * 科研项目
 * Created by mason on 2023/4/18
 */
public interface ResearchProjectService {
    /**
     * 获取类别
     * @return
     */
    List<RpClassifi> getRpClassifi();

    /**
     * 项目来源
     */
    List<RpProjectSource> getRpProjectSource(Long rpClassId);

    /**
     * 申请
     * @param rpClassId
     * @param rpProSouId
     * @return
     */
    int apply(Long rpClassId, Long rpProSouId);
}
