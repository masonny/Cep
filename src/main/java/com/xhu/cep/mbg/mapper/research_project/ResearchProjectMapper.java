package com.xhu.cep.mbg.mapper.research_project;

import com.xhu.cep.mbg.model.research_project.ResearchProject;
import com.xhu.cep.mbg.model.research_project.ResearchProjectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResearchProjectMapper {
    long countByExample(ResearchProjectExample example);

    int deleteByExample(ResearchProjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ResearchProject record);

    int insertSelective(ResearchProject record);

    List<ResearchProject> selectByExample(ResearchProjectExample example);

    ResearchProject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ResearchProject record, @Param("example") ResearchProjectExample example);

    int updateByExample(@Param("record") ResearchProject record, @Param("example") ResearchProjectExample example);

    int updateByPrimaryKeySelective(ResearchProject record);

    int updateByPrimaryKey(ResearchProject record);
}