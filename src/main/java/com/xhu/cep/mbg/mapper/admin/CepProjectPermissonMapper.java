package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.CepProjectPermisson;
import com.xhu.cep.mbg.model.admin.CepProjectPermissonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CepProjectPermissonMapper {
    int countByExample(CepProjectPermissonExample example);

    int deleteByExample(CepProjectPermissonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CepProjectPermisson record);

    int insertSelective(CepProjectPermisson record);

    List<CepProjectPermisson> selectByExample(CepProjectPermissonExample example);

    CepProjectPermisson selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CepProjectPermisson record, @Param("example") CepProjectPermissonExample example);

    int updateByExample(@Param("record") CepProjectPermisson record, @Param("example") CepProjectPermissonExample example);

    int updateByPrimaryKeySelective(CepProjectPermisson record);

    int updateByPrimaryKey(CepProjectPermisson record);
}