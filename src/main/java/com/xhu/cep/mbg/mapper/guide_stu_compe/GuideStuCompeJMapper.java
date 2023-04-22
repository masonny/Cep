package com.xhu.cep.mbg.mapper.guide_stu_compe;

import com.xhu.cep.mbg.model.guide_stu_compe.GuideStuCompeJ;
import com.xhu.cep.mbg.model.guide_stu_compe.GuideStuCompeJExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuideStuCompeJMapper {
    long countByExample(GuideStuCompeJExample example);

    int deleteByExample(GuideStuCompeJExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GuideStuCompeJ record);

    int insertSelective(GuideStuCompeJ record);

    List<GuideStuCompeJ> selectByExample(GuideStuCompeJExample example);

    GuideStuCompeJ selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GuideStuCompeJ record, @Param("example") GuideStuCompeJExample example);

    int updateByExample(@Param("record") GuideStuCompeJ record, @Param("example") GuideStuCompeJExample example);

    int updateByPrimaryKeySelective(GuideStuCompeJ record);

    int updateByPrimaryKey(GuideStuCompeJ record);
}