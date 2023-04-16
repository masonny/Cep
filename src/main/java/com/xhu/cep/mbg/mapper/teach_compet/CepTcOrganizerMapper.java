package com.xhu.cep.mbg.mapper.teach_compet;

import com.xhu.cep.mbg.model.teach_compet.CepTcOrganizer;
import com.xhu.cep.mbg.model.teach_compet.CepTcOrganizerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CepTcOrganizerMapper {
    long countByExample(CepTcOrganizerExample example);

    int deleteByExample(CepTcOrganizerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CepTcOrganizer record);

    int insertSelective(CepTcOrganizer record);

    List<CepTcOrganizer> selectByExample(CepTcOrganizerExample example);

    CepTcOrganizer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CepTcOrganizer record, @Param("example") CepTcOrganizerExample example);

    int updateByExample(@Param("record") CepTcOrganizer record, @Param("example") CepTcOrganizerExample example);

    int updateByPrimaryKeySelective(CepTcOrganizer record);

    int updateByPrimaryKey(CepTcOrganizer record);
}