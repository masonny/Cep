package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.UserPatent;
import com.xhu.cep.mbg.model.admin.UserPatentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPatentMapper {
    long countByExample(UserPatentExample example);

    int deleteByExample(UserPatentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPatent record);

    int insertSelective(UserPatent record);

    List<UserPatent> selectByExample(UserPatentExample example);

    UserPatent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserPatent record, @Param("example") UserPatentExample example);

    int updateByExample(@Param("record") UserPatent record, @Param("example") UserPatentExample example);

    int updateByPrimaryKeySelective(UserPatent record);

    int updateByPrimaryKey(UserPatent record);
}