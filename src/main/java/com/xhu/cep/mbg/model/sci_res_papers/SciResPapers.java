package com.xhu.cep.mbg.model.sci_res_papers;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by mason on 2023/4/18
 */
@Data
@AllArgsConstructor
public class SciResPapers {
    private Long id;
    @ApiModelProperty(value = "期刊名字")
    private String sciResPapersName;
    @ApiModelProperty(value = "期刊级别")
    private String sciRankName;
    @ApiModelProperty(value = "K值")
    private String sciRankK;
}
