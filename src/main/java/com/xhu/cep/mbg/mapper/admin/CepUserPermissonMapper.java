package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.CepUserPermisson;
import com.xhu.cep.mbg.model.admin.CepUserPermissonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CepUserPermissonMapper {
    int countByExample(CepUserPermissonExample example);

    int deleteByExample(CepUserPermissonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CepUserPermisson record);

    int insertSelective(CepUserPermisson record);

    List<CepUserPermisson> selectByExample(CepUserPermissonExample example);

    CepUserPermisson selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CepUserPermisson record, @Param("example") CepUserPermissonExample example);

    int updateByExample(@Param("record") CepUserPermisson record, @Param("example") CepUserPermissonExample example);

    int updateByPrimaryKeySelective(CepUserPermisson record);

    int updateByPrimaryKey(CepUserPermisson record);
}