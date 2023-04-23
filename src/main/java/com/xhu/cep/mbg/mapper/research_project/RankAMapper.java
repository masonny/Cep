package com.xhu.cep.mbg.mapper.research_project;

import com.xhu.cep.mbg.model.research_project.RankA;
import com.xhu.cep.mbg.model.research_project.RankAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankAMapper {
    long countByExample(RankAExample example);

    int deleteByExample(RankAExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RankA record);

    int insertSelective(RankA record);

    List<RankA> selectByExample(RankAExample example);

    RankA selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RankA record, @Param("example") RankAExample example);

    int updateByExample(@Param("record") RankA record, @Param("example") RankAExample example);

    int updateByPrimaryKeySelective(RankA record);

    int updateByPrimaryKey(RankA record);
}