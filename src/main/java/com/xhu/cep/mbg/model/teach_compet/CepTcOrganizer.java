package com.xhu.cep.mbg.model.teach_compet;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
public class CepTcOrganizer implements Serializable {
    private Long id;

    /**
     * 主办单位
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主办单位")
    private String name;

    /**
     * 比赛名字外键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "比赛名字外键")
    private Integer tcNameId;

    /**
     * 认定级别id，A1=11，B2=22
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "认定级别id，A1=11，B2=22")
    private Integer identificationLevelId;

    /**
     * 描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "描述")
    private String descripation;

    /**
     * 状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态")
    private Integer status;

    /**
     * 排序
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date creteTime;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "修改时间")
    private Date updataTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTcNameId() {
        return tcNameId;
    }

    public void setTcNameId(Integer tcNameId) {
        this.tcNameId = tcNameId;
    }

    public Integer getIdentificationLevelId() {
        return identificationLevelId;
    }

    public void setIdentificationLevelId(Integer identificationLevelId) {
        this.identificationLevelId = identificationLevelId;
    }

    public String getDescripation() {
        return descripation;
    }

    public void setDescripation(String descripation) {
        this.descripation = descripation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }

    public Date getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Date updataTime) {
        this.updataTime = updataTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", tcNameId=").append(tcNameId);
        sb.append(", identificationLevelId=").append(identificationLevelId);
        sb.append(", descripation=").append(descripation);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", creteTime=").append(creteTime);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}