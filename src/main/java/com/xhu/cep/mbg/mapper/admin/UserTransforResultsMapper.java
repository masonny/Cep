package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.UserTransforResults;
import com.xhu.cep.mbg.model.admin.UserTransforResultsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTransforResultsMapper {
    long countByExample(UserTransforResultsExample example);

    int deleteByExample(UserTransforResultsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTransforResults record);

    int insertSelective(UserTransforResults record);

    List<UserTransforResults> selectByExample(UserTransforResultsExample example);

    UserTransforResults selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTransforResults record, @Param("example") UserTransforResultsExample example);

    int updateByExample(@Param("record") UserTransforResults record, @Param("example") UserTransforResultsExample example);

    int updateByPrimaryKeySelective(UserTransforResults record);

    int updateByPrimaryKey(UserTransforResults record);
}