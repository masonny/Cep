package com.xhu.cep.mbg.model.teach_compet;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class CepTeachingCompetition implements Serializable {
    private Long id;

    /**
     * 比赛名称外键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "比赛名称外键")
    private Integer tcNameId;

    /**
     * 主办单位ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主办单位ID")
    private Integer organizerId;

    /**
     * 获奖等级外键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "获奖等级外键")
    private Integer identificationLevelId;

    /**
     * 获奖等级ID
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "获奖等级ID")
    private Integer rewardLevelId;

    /**
     * 状态,通过=1
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态,通过=1")
    private Integer status;

    /**
     * 排序
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 备注
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "备注")
    private String note;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "修改时间")
    private Date updataTime;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date crateTime;

    private static final long serialVersionUID = 1L;

    public CepTeachingCompetition(Long id, Integer tcNameId, Integer organizerId, Integer identificationLevelId, Integer rewardLevelId, Integer status, Integer sort, String note, Date updataTime, Date crateTime) {
        this.id = id;
        this.tcNameId = tcNameId;
        this.organizerId = organizerId;
        this.identificationLevelId = identificationLevelId;
        this.rewardLevelId = rewardLevelId;
        this.status = status;
        this.sort = sort;
        this.note = note;
        this.updataTime = updataTime;
        this.crateTime = crateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTcNameId() {
        return tcNameId;
    }

    public void setTcNameId(Integer tcNameId) {
        this.tcNameId = tcNameId;
    }

    public Integer getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(Integer organizerId) {
        this.organizerId = organizerId;
    }

    public Integer getIdentificationLevelId() {
        return identificationLevelId;
    }

    public void setIdentificationLevelId(Integer identificationLevelId) {
        this.identificationLevelId = identificationLevelId;
    }

    public Integer getRewardLevelId() {
        return rewardLevelId;
    }

    public void setRewardLevelId(Integer rewardLevelId) {
        this.rewardLevelId = rewardLevelId;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Date updataTime) {
        this.updataTime = updataTime;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tcNameId=").append(tcNameId);
        sb.append(", organizerId=").append(organizerId);
        sb.append(", identificationLevelId=").append(identificationLevelId);
        sb.append(", rewardLevelId=").append(rewardLevelId);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", note=").append(note);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", crateTime=").append(crateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}