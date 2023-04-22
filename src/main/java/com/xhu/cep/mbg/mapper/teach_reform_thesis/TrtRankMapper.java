package com.xhu.cep.mbg.mapper.teach_reform_thesis;

import com.xhu.cep.mbg.model.teach_reform_thesis.TrtRank;
import com.xhu.cep.mbg.model.teach_reform_thesis.TrtRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrtRankMapper {
    long countByExample(TrtRankExample example);

    int deleteByExample(TrtRankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrtRank record);

    int insertSelective(TrtRank record);

    List<TrtRank> selectByExample(TrtRankExample example);

    TrtRank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrtRank record, @Param("example") TrtRankExample example);

    int updateByExample(@Param("record") TrtRank record, @Param("example") TrtRankExample example);

    int updateByPrimaryKeySelective(TrtRank record);

    int updateByPrimaryKey(TrtRank record);
}