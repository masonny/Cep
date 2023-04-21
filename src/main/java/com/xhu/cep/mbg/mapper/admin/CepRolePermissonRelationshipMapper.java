package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.CepRolePermissonRelationship;
import com.xhu.cep.mbg.model.admin.CepRolePermissonRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CepRolePermissonRelationshipMapper {
    long countByExample(CepRolePermissonRelationshipExample example);

    int deleteByExample(CepRolePermissonRelationshipExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CepRolePermissonRelationship record);

    int insertSelective(CepRolePermissonRelationship record);

    List<CepRolePermissonRelationship> selectByExample(CepRolePermissonRelationshipExample example);

    CepRolePermissonRelationship selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CepRolePermissonRelationship record, @Param("example") CepRolePermissonRelationshipExample example);

    int updateByExample(@Param("record") CepRolePermissonRelationship record, @Param("example") CepRolePermissonRelationshipExample example);

    int updateByPrimaryKeySelective(CepRolePermissonRelationship record);

    int updateByPrimaryKey(CepRolePermissonRelationship record);
}