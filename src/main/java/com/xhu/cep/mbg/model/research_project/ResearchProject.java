package com.xhu.cep.mbg.model.research_project;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class ResearchProject implements Serializable {
    private Long id;

    /**
     * 等级A
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "等级A")
    private String name;

    /**
     * 等级A
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "等级A")
    private Long rankAId;

    /**
     * 等级A1
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "等级A1")
    private Long rankA1Id;

    /**
     * 类别
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "类别")
    private Long classifiId;

    /**
     * 项目来源
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "项目来源")
    private Long projSouId;

    /**
     * K值
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "K值")
    private Long kId;

    /**
     * 通不通过
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "通不通过")
    private Integer status;

    /**
     * 描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "描述")
    private String descripation;

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

    public Long getRankAId() {
        return rankAId;
    }

    public void setRankAId(Long rankAId) {
        this.rankAId = rankAId;
    }

    public Long getRankA1Id() {
        return rankA1Id;
    }

    public void setRankA1Id(Long rankA1Id) {
        this.rankA1Id = rankA1Id;
    }

    public Long getClassifiId() {
        return classifiId;
    }

    public void setClassifiId(Long classifiId) {
        this.classifiId = classifiId;
    }

    public Long getProjSouId() {
        return projSouId;
    }

    public void setProjSouId(Long projSouId) {
        this.projSouId = projSouId;
    }

    public Long getkId() {
        return kId;
    }

    public void setkId(Long kId) {
        this.kId = kId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescripation() {
        return descripation;
    }

    public void setDescripation(String descripation) {
        this.descripation = descripation;
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
        sb.append(", rankAId=").append(rankAId);
        sb.append(", rankA1Id=").append(rankA1Id);
        sb.append(", classifiId=").append(classifiId);
        sb.append(", projSouId=").append(projSouId);
        sb.append(", kId=").append(kId);
        sb.append(", status=").append(status);
        sb.append(", descripation=").append(descripation);
        sb.append(", sort=").append(sort);
        sb.append(", creteTime=").append(creteTime);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}