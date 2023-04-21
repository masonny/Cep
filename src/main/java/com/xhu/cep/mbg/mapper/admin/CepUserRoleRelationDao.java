package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.CepProjectPermisson;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by mason on 2023/4/21
 */
public interface CepUserRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<CepProjectPermisson> getPermissionList(@Param("userId") Long userId);
}