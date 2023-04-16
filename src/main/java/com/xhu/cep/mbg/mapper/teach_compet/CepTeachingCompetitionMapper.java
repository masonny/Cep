package com.xhu.cep.mbg.mapper.teach_compet;

import com.xhu.cep.mbg.model.teach_compet.CepTeachingCompetition;
import com.xhu.cep.mbg.model.teach_compet.CepTeachingCompetitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CepTeachingCompetitionMapper {
    long countByExample(CepTeachingCompetitionExample example);

    int deleteByExample(CepTeachingCompetitionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CepTeachingCompetition record);

    int insertSelective(CepTeachingCompetition record);

    List<CepTeachingCompetition> selectByExample(CepTeachingCompetitionExample example);

    CepTeachingCompetition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CepTeachingCompetition record, @Param("example") CepTeachingCompetitionExample example);

    int updateByExample(@Param("record") CepTeachingCompetition record, @Param("example") CepTeachingCompetitionExample example);

    int updateByPrimaryKeySelective(CepTeachingCompetition record);

    int updateByPrimaryKey(CepTeachingCompetition record);
}