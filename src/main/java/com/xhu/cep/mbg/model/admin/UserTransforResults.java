package com.xhu.cep.mbg.model.admin;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class UserTransforResults implements Serializable {
    private Long id;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;

    /**
     * 收益
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "收益")
    private Integer myProfit;

    /**
     * 成果转化id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "成果转化id")
    private Long transforResultsId;

    /**
     * K值
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "K值")
    private Integer k;

    /**
     * 等级
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "等级")
    private String name;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getMyProfit() {
        return myProfit;
    }

    public void setMyProfit(Integer myProfit) {
        this.myProfit = myProfit;
    }

    public Long getTransforResultsId() {
        return transforResultsId;
    }

    public void setTransforResultsId(Long transforResultsId) {
        this.transforResultsId = transforResultsId;
    }

    public Integer getK() {
        return k;
    }

    public void setK(Integer k) {
        this.k = k;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        sb.append(", userId=").append(userId);
        sb.append(", myProfit=").append(myProfit);
        sb.append(", transforResultsId=").append(transforResultsId);
        sb.append(", k=").append(k);
        sb.append(", name=").append(name);
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