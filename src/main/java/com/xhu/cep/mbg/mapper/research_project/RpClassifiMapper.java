package com.xhu.cep.mbg.mapper.research_project;

import com.xhu.cep.mbg.model.research_project.RpClassifi;
import com.xhu.cep.mbg.model.research_project.RpClassifiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpClassifiMapper {
    long countByExample(RpClassifiExample example);

    int deleteByExample(RpClassifiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RpClassifi record);

    int insertSelective(RpClassifi record);

    List<RpClassifi> selectByExample(RpClassifiExample example);

    RpClassifi selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RpClassifi record, @Param("example") RpClassifiExample example);

    int updateByExample(@Param("record") RpClassifi record, @Param("example") RpClassifiExample example);

    int updateByPrimaryKeySelective(RpClassifi record);

    int updateByPrimaryKey(RpClassifi record);
}