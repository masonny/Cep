package com.xhu.cep.mbg.mapper.research_project;

import com.xhu.cep.mbg.model.research_project.RpProjectSource;
import com.xhu.cep.mbg.model.research_project.RpProjectSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpProjectSourceMapper {
    long countByExample(RpProjectSourceExample example);

    int deleteByExample(RpProjectSourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RpProjectSource record);

    int insertSelective(RpProjectSource record);

    List<RpProjectSource> selectByExample(RpProjectSourceExample example);

    RpProjectSource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RpProjectSource record, @Param("example") RpProjectSourceExample example);

    int updateByExample(@Param("record") RpProjectSource record, @Param("example") RpProjectSourceExample example);

    int updateByPrimaryKeySelective(RpProjectSource record);

    int updateByPrimaryKey(RpProjectSource record);
}