package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.UserRp;
import com.xhu.cep.mbg.model.admin.UserRpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRpMapper {
    long countByExample(UserRpExample example);

    int deleteByExample(UserRpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRp record);

    int insertSelective(UserRp record);

    List<UserRp> selectByExample(UserRpExample example);

    UserRp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRp record, @Param("example") UserRpExample example);

    int updateByExample(@Param("record") UserRp record, @Param("example") UserRpExample example);

    int updateByPrimaryKeySelective(UserRp record);

    int updateByPrimaryKey(UserRp record);
}