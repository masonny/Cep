package com.xhu.cep.mbg.mapper.guide_stu_compe;

import com.xhu.cep.mbg.model.guide_stu_compe.TeamIndivLarge;
import com.xhu.cep.mbg.model.guide_stu_compe.TeamIndivLargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamIndivLargeMapper {
    long countByExample(TeamIndivLargeExample example);

    int deleteByExample(TeamIndivLargeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TeamIndivLarge record);

    int insertSelective(TeamIndivLarge record);

    List<TeamIndivLarge> selectByExample(TeamIndivLargeExample example);

    TeamIndivLarge selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TeamIndivLarge record, @Param("example") TeamIndivLargeExample example);

    int updateByExample(@Param("record") TeamIndivLarge record, @Param("example") TeamIndivLargeExample example);

    int updateByPrimaryKeySelective(TeamIndivLarge record);

    int updateByPrimaryKey(TeamIndivLarge record);
}