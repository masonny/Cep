package com.xhu.cep.mbg.mapper.research_project;

import com.xhu.cep.mbg.model.research_project.RankA1;
import com.xhu.cep.mbg.model.research_project.RankA1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankA1Mapper {
    long countByExample(RankA1Example example);

    int deleteByExample(RankA1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(RankA1 record);

    int insertSelective(RankA1 record);

    List<RankA1> selectByExample(RankA1Example example);

    RankA1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RankA1 record, @Param("example") RankA1Example example);

    int updateByExample(@Param("record") RankA1 record, @Param("example") RankA1Example example);

    int updateByPrimaryKeySelective(RankA1 record);

    int updateByPrimaryKey(RankA1 record);
}