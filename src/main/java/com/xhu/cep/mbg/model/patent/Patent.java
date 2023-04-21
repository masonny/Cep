package com.xhu.cep.mbg.model.patent;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by mason on 2023/4/18
 */
@Data
@AllArgsConstructor
public class Patent {
    private Long id;
    @ApiModelProperty(value = "等级一")
    private String rankAName;
    @ApiModelProperty(value = "等级二")
    private String rankA1Name;
    @ApiModelProperty(value = "知识产权")
    private String patentName;
    @ApiModelProperty(value = "K值")
    private String patentKK;
}
