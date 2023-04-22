package com.xhu.cep.mbg.mapper.teach_reform_thesis;

import com.xhu.cep.mbg.model.teach_reform_thesis.TrtReward;
import com.xhu.cep.mbg.model.teach_reform_thesis.TrtRewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrtRewardMapper {
    long countByExample(TrtRewardExample example);

    int deleteByExample(TrtRewardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrtReward record);

    int insertSelective(TrtReward record);

    List<TrtReward> selectByExample(TrtRewardExample example);

    TrtReward selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrtReward record, @Param("example") TrtRewardExample example);

    int updateByExample(@Param("record") TrtReward record, @Param("example") TrtRewardExample example);

    int updateByPrimaryKeySelective(TrtReward record);

    int updateByPrimaryKey(TrtReward record);
}