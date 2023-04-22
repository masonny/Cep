package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.UserSciPaper;
import com.xhu.cep.mbg.model.admin.UserSciPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSciPaperMapper {
    long countByExample(UserSciPaperExample example);

    int deleteByExample(UserSciPaperExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserSciPaper record);

    int insertSelective(UserSciPaper record);

    List<UserSciPaper> selectByExample(UserSciPaperExample example);

    UserSciPaper selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserSciPaper record, @Param("example") UserSciPaperExample example);

    int updateByExample(@Param("record") UserSciPaper record, @Param("example") UserSciPaperExample example);

    int updateByPrimaryKeySelective(UserSciPaper record);

    int updateByPrimaryKey(UserSciPaper record);
}