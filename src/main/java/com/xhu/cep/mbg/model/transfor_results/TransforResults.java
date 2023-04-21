package com.xhu.cep.mbg.model.transfor_results;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by mason on 2023/4/18
 */
@Data
@AllArgsConstructor
public class TransforResults {
    private Long id;
    @ApiModelProperty(value = "等级")
    private String transforRankName;
    @ApiModelProperty(value = "收益阈值")
    private String transforResultsProfit;
    @ApiModelProperty(value = "倍率")
    private String transforResultsK;
}
