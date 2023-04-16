package com.xhu.cep.mbg.model.teach_compet;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
public class CepTcReward implements Serializable {
    private Long id;

    /**
     * J值ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "J值ID")
    private Integer rewardLevelId;

    /**
     * 自定义等级A1=11,B2=22
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "自定义等级A1=11,B2=22")
    private String identificationLevelId;

    /**
     * 获奖等级名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "获奖等级名称")
    private String rewardLevelName;

    /**
     * J值
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "J值")
    private Integer j;

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

    public Integer getRewardLevelId() {
        return rewardLevelId;
    }

    public void setRewardLevelId(Integer rewardLevelId) {
        this.rewardLevelId = rewardLevelId;
    }

    public String getIdentificationLevelId() {
        return identificationLevelId;
    }

    public void setIdentificationLevelId(String identificationLevelId) {
        this.identificationLevelId = identificationLevelId;
    }

    public String getRewardLevelName() {
        return rewardLevelName;
    }

    public void setRewardLevelName(String rewardLevelName) {
        this.rewardLevelName = rewardLevelName;
    }

    public Integer getJ() {
        return j;
    }

    public void setJ(Integer j) {
        this.j = j;
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
        sb.append(", rewardLevelId=").append(rewardLevelId);
        sb.append(", identificationLevelId=").append(identificationLevelId);
        sb.append(", rewardLevelName=").append(rewardLevelName);
        sb.append(", j=").append(j);
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