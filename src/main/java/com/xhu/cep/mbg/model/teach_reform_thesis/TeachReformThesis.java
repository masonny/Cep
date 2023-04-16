package com.xhu.cep.mbg.model.teach_reform_thesis;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 教改论文类别
 * Created by mason on 2023/4/17
 */
@Data
@AllArgsConstructor
public class TeachReformThesis {
    private Long id;
    @ApiModelProperty(value = "等级")
    private String rank;
    @ApiModelProperty(value = "类别")
    private String kind;
    @ApiModelProperty(value = "奖励标准J值")
    private int j;
}
