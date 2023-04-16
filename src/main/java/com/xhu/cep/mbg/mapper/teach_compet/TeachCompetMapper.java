package com.xhu.cep.mbg.mapper.teach_compet;

import com.xhu.cep.mbg.model.teach_compet.TeachCompet;

import java.util.List;

/**
 * 教师竞赛认定表
 * Created by mason on 2023/4/16
 */
public interface TeachCompetMapper {
    List<TeachCompet> getTeachCompetAll();
}