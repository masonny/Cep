package com.xhu.cep.mbg.model.tc;

import java.io.Serializable;
import java.util.Date;

public class CepTcName implements Serializable {
    private Long id;

    /**
     * 比赛名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 主办单位ID
     *
     * @mbggenerated
     */
    private Integer organizerId;

    /**
     * 描述
     *
     * @mbggenerated
     */
    private String descripation;

    /**
     * 状态
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updataTime;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date creteTime;

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

    public Integer getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(Integer organizerId) {
        this.organizerId = organizerId;
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

    public Date getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Date updataTime) {
        this.updataTime = updataTime;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", organizerId=").append(organizerId);
        sb.append(", descripation=").append(descripation);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", creteTime=").append(creteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}