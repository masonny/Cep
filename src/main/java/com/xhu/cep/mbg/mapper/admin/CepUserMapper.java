package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.CepUser;
import com.xhu.cep.mbg.model.admin.CepUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CepUserMapper {
    long countByExample(CepUserExample example);

    int deleteByExample(CepUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CepUser record);

    int insertSelective(CepUser record);

    List<CepUser> selectByExample(CepUserExample example);

    CepUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CepUser record, @Param("example") CepUserExample example);

    int updateByExample(@Param("record") CepUser record, @Param("example") CepUserExample example);

    int updateByPrimaryKeySelective(CepUser record);

    int updateByPrimaryKey(CepUser record);
}