package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.UserTeachCompet;
import com.xhu.cep.mbg.model.admin.UserTeachCompetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTeachCompetMapper {
    long countByExample(UserTeachCompetExample example);

    int deleteByExample(UserTeachCompetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTeachCompet record);

    int insertSelective(UserTeachCompet record);

    List<UserTeachCompet> selectByExample(UserTeachCompetExample example);

    UserTeachCompet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTeachCompet record, @Param("example") UserTeachCompetExample example);

    int updateByExample(@Param("record") UserTeachCompet record, @Param("example") UserTeachCompetExample example);

    int updateByPrimaryKeySelective(UserTeachCompet record);

    int updateByPrimaryKey(UserTeachCompet record);
}