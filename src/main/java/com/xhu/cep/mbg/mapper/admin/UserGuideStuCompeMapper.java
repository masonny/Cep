package com.xhu.cep.mbg.mapper.admin;

import com.xhu.cep.mbg.model.admin.UserGuideStuCompe;
import com.xhu.cep.mbg.model.admin.UserGuideStuCompeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGuideStuCompeMapper {
    long countByExample(UserGuideStuCompeExample example);

    int deleteByExample(UserGuideStuCompeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserGuideStuCompe record);

    int insertSelective(UserGuideStuCompe record);

    List<UserGuideStuCompe> selectByExample(UserGuideStuCompeExample example);

    UserGuideStuCompe selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserGuideStuCompe record, @Param("example") UserGuideStuCompeExample example);

    int updateByExample(@Param("record") UserGuideStuCompe record, @Param("example") UserGuideStuCompeExample example);

    int updateByPrimaryKeySelective(UserGuideStuCompe record);

    int updateByPrimaryKey(UserGuideStuCompe record);
}