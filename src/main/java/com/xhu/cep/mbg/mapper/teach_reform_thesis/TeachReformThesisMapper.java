package com.xhu.cep.mbg.mapper.teach_reform_thesis;

import com.xhu.cep.mbg.model.teach_reform_thesis.TeachReformThesis;
import com.xhu.cep.mbg.model.teach_reform_thesis.TeachReformThesisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachReformThesisMapper {
    long countByExample(TeachReformThesisExample example);

    int deleteByExample(TeachReformThesisExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeachReformThesis record);

    int insertSelective(TeachReformThesis record);

    List<TeachReformThesis> selectByExample(TeachReformThesisExample example);

    TeachReformThesis selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeachReformThesis record, @Param("example") TeachReformThesisExample example);

    int updateByExample(@Param("record") TeachReformThesis record, @Param("example") TeachReformThesisExample example);

    int updateByPrimaryKeySelective(TeachReformThesis record);

    int updateByPrimaryKey(TeachReformThesis record);
}