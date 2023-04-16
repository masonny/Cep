package com.xhu.cep.mbg.model.teach_compet;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeachCompet {
    private Long id;

    @ApiModelProperty(value = "比赛名称")
    private String cepTcName;

    @ApiModelProperty(value = "主办单位")
    private String cepTcOrganizerName;

    @ApiModelProperty(value = "认定级别")
    private String cepTcIdentificationLevelName;

    public TeachCompet(Long id, String cepTcName, String cepTcOrganizerName, String cepTcIdentificationLevelName) {
        this.id = id;
        this.cepTcName = cepTcName;
        this.cepTcOrganizerName = cepTcOrganizerName;
        this.cepTcIdentificationLevelName = cepTcIdentificationLevelName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCepTcName() {
        return cepTcName;
    }

    public void setCepTcName(String cepTcName) {
        this.cepTcName = cepTcName;
    }

    public String getCepTcOrganizerName() {
        return cepTcOrganizerName;
    }

    public void setCepTcOrganizerName(String cepTcOrganizerName) {
        this.cepTcOrganizerName = cepTcOrganizerName;
    }

    public String getCepTcIdentificationLevelName() {
        return cepTcIdentificationLevelName;
    }

    public void setCepTcIdentificationLevelName(String cepTcIdentificationLevelName) {
        this.cepTcIdentificationLevelName = cepTcIdentificationLevelName;
    }
}
