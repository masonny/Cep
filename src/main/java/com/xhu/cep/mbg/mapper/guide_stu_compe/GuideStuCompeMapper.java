package com.xhu.cep.mbg.mapper.guide_stu_compe;

import com.xhu.cep.mbg.model.guide_stu_compe.GuideStuCompe;
import com.xhu.cep.mbg.model.guide_stu_compe.GuideStuCompeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuideStuCompeMapper {
    long countByExample(GuideStuCompeExample example);

    int deleteByExample(GuideStuCompeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GuideStuCompe record);

    int insertSelective(GuideStuCompe record);

    List<GuideStuCompe> selectByExample(GuideStuCompeExample example);

    GuideStuCompe selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GuideStuCompe record, @Param("example") GuideStuCompeExample example);

    int updateByExample(@Param("record") GuideStuCompe record, @Param("example") GuideStuCompeExample example);

    int updateByPrimaryKeySelective(GuideStuCompe record);

    int updateByPrimaryKey(GuideStuCompe record);
}