package com.xhu.cep.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by mason on 2023/4/22
 */
@Data
public class UserGuideStuCompeParam {
    @ApiModelProperty(value = "比赛名称id", required = true)
    @NotEmpty(message = "比赛名称id不能为空")
    private String tcNameId;
    @ApiModelProperty(value = "主办单位id", required = true)
    @NotEmpty(message = "主办单位不能为空")
    private String tcOrganId;
    @ApiModelProperty(value = "奖励标准J值id", required = true)
    @NotEmpty(message = "奖励标准J值id不能空")
    private String teamIndivLargesId;
}
