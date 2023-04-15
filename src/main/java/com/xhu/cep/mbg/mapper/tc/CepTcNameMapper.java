package com.xhu.cep.mbg.mapper.tc;

import com.xhu.cep.mbg.model.tc.CepTcName;
import com.xhu.cep.mbg.model.tc.CepTcNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CepTcNameMapper {
    int countByExample(CepTcNameExample example);

    int deleteByExample(CepTcNameExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CepTcName record);

    int insertSelective(CepTcName record);

    List<CepTcName> selectByExample(CepTcNameExample example);

    CepTcName selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CepTcName record, @Param("example") CepTcNameExample example);

    int updateByExample(@Param("record") CepTcName record, @Param("example") CepTcNameExample example);

    int updateByPrimaryKeySelective(CepTcName record);

    int updateByPrimaryKey(CepTcName record);
}