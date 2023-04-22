package com.xhu.cep.mbg.model.admin;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class UserGuideStuCompe implements Serializable {
    private Long id;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;

    /**
     * 指导学生竞赛id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "指导学生竞赛id")
    private Long guideStuCompeId;

    /**
     * 描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "描述")
    private String descripation;

    /**
     * 团队还是个人或大型集体项目
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "团队还是个人或大型集体项目")
    private Long teamIndivLargeId;

    /**
     * 通过状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "通过状态")
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGuideStuCompeId() {
        return guideStuCompeId;
    }

    public void setGuideStuCompeId(Long guideStuCompeId) {
        this.guideStuCompeId = guideStuCompeId;
    }

    public String getDescripation() {
        return descripation;
    }

    public void setDescripation(String descripation) {
        this.descripation = descripation;
    }

    public Long getTeamIndivLargeId() {
        return teamIndivLargeId;
    }

    public void setTeamIndivLargeId(Long teamIndivLargeId) {
        this.teamIndivLargeId = teamIndivLargeId;
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
        sb.append(", userId=").append(userId);
        sb.append(", guideStuCompeId=").append(guideStuCompeId);
        sb.append(", descripation=").append(descripation);
        sb.append(", teamIndivLargeId=").append(teamIndivLargeId);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", creteTime=").append(creteTime);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}