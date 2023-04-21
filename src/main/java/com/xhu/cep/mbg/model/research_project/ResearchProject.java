package com.xhu.cep.mbg.model.research_project;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by mason on 2023/4/18
 */
@Data
@AllArgsConstructor
public class ResearchProject {
    private Long id;
    @ApiModelProperty(value = "等级一")
    private String rankAName;
    @ApiModelProperty(value = "等级二")
    private String rankA1Name;
    @ApiModelProperty(value = "项目来源")
    private String rpProjectSourceName;
    @ApiModelProperty(value = "K值")
    private int k;
}
