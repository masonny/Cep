package com.xhu.cep.mbg.mapper.teach_compet;

import com.xhu.cep.mbg.model.teach_compet.CepTcReward;
import com.xhu.cep.mbg.model.teach_compet.CepTcRewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CepTcRewardMapper {
    long countByExample(CepTcRewardExample example);

    int deleteByExample(CepTcRewardExample example);

    int deleteByPrimaryKey(@Param("id") Long id, @Param("rewardLevelId") Integer rewardLevelId, @Param("identificationLevelId") String identificationLevelId);

    int insert(CepTcReward record);

    int insertSelective(CepTcReward record);

    List<CepTcReward> selectByExample(CepTcRewardExample example);

    CepTcReward selectByPrimaryKey(@Param("id") Long id, @Param("rewardLevelId") Integer rewardLevelId, @Param("identificationLevelId") String identificationLevelId);

    int updateByExampleSelective(@Param("record") CepTcReward record, @Param("example") CepTcRewardExample example);

    int updateByExample(@Param("record") CepTcReward record, @Param("example") CepTcRewardExample example);

    int updateByPrimaryKeySelective(CepTcReward record);

    int updateByPrimaryKey(CepTcReward record);
}