package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.UserTeachReformThesis;
import com.xhu.cep.mbg.model.admin.UserTeachReformThesisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTeachReformThesisMapper {
    long countByExample(UserTeachReformThesisExample example);

    int deleteByExample(UserTeachReformThesisExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTeachReformThesis record);

    int insertSelective(UserTeachReformThesis record);

    List<UserTeachReformThesis> selectByExample(UserTeachReformThesisExample example);

    UserTeachReformThesis selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTeachReformThesis record, @Param("example") UserTeachReformThesisExample example);

    int updateByExample(@Param("record") UserTeachReformThesis record, @Param("example") UserTeachReformThesisExample example);

    int updateByPrimaryKeySelective(UserTeachReformThesis record);

    int updateByPrimaryKey(UserTeachReformThesis record);
}