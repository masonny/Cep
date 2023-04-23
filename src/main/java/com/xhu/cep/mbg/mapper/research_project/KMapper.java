package com.xhu.cep.mbg.mapper.research_project;

import com.xhu.cep.mbg.model.research_project.K;
import com.xhu.cep.mbg.model.research_project.KExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KMapper {
    long countByExample(KExample example);

    int deleteByExample(KExample example);

    int deleteByPrimaryKey(Long id);

    int insert(K record);

    int insertSelective(K record);

    List<K> selectByExample(KExample example);

    K selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") K record, @Param("example") KExample example);

    int updateByExample(@Param("record") K record, @Param("example") KExample example);

    int updateByPrimaryKeySelective(K record);

    int updateByPrimaryKey(K record);
}