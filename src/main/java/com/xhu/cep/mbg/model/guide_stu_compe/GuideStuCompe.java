package com.xhu.cep.mbg.model.guide_stu_compe;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class GuideStuCompe implements Serializable {
    private Long id;

    /**
     * 比赛名称id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "比赛名称id")
    private Long tcNameId;

    /**
     * 主办单位id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主办单位id")
    private Long organizerId;

    /**
     * 认定级别id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "认定级别id")
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

    /**
     * 团队还是个人id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "团队还是个人id")
    private Long teamIndivLargeId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTcNameId() {
        return tcNameId;
    }

    public void setTcNameId(Long tcNameId) {
        this.tcNameId = tcNameId;
    }

    public Long getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(Long organizerId) {
        this.organizerId = organizerId;
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

    public Long getTeamIndivLargeId() {
        return teamIndivLargeId;
    }

    public void setTeamIndivLargeId(Long teamIndivLargeId) {
        this.teamIndivLargeId = teamIndivLargeId;
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
        sb.append(", descripation=").append(descripation);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", creteTime=").append(creteTime);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", teamIndivLargeId=").append(teamIndivLargeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}