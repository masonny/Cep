package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.CepRole;
import com.xhu.cep.mbg.model.admin.CepRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CepRoleMapper {
    long countByExample(CepRoleExample example);

    int deleteByExample(CepRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CepRole record);

    int insertSelective(CepRole record);

    List<CepRole> selectByExample(CepRoleExample example);

    CepRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CepRole record, @Param("example") CepRoleExample example);

    int updateByExample(@Param("record") CepRole record, @Param("example") CepRoleExample example);

    int updateByPrimaryKeySelective(CepRole record);

    int updateByPrimaryKey(CepRole record);


}