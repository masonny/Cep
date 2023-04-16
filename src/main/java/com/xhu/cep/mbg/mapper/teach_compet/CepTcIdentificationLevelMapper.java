package com.xhu.cep.mbg.mapper.teach_compet;

import com.xhu.cep.mbg.model.teach_compet.CepTcIdentificationLevel;
import com.xhu.cep.mbg.model.teach_compet.CepTcIdentificationLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CepTcIdentificationLevelMapper {
    long countByExample(CepTcIdentificationLevelExample example);

    int deleteByExample(CepTcIdentificationLevelExample example);

    int deleteByPrimaryKey(@Param("id") Long id, @Param("identificationLevelId") Integer identificationLevelId);

    int insert(CepTcIdentificationLevel record);

    int insertSelective(CepTcIdentificationLevel record);

    List<CepTcIdentificationLevel> selectByExample(CepTcIdentificationLevelExample example);

    CepTcIdentificationLevel selectByPrimaryKey(@Param("id") Long id, @Param("identificationLevelId") Integer identificationLevelId);

    int updateByExampleSelective(@Param("record") CepTcIdentificationLevel record, @Param("example") CepTcIdentificationLevelExample example);

    int updateByExample(@Param("record") CepTcIdentificationLevel record, @Param("example") CepTcIdentificationLevelExample example);

    int updateByPrimaryKeySelective(CepTcIdentificationLevel record);

    int updateByPrimaryKey(CepTcIdentificationLevel record);
}