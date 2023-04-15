package com.xhu.cep.mbg.model.admin;

import java.io.Serializable;
import java.util.Date;

public class CepRole implements Serializable {
    private Long id;

    /**
     * 角色名字
     *
     * @mbggenerated
     */
    private String name;

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
     * 创建时间
     *
     * @mbggenerated
     */
    private Date crateTime;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
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

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
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
        sb.append(", descripation=").append(descripation);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", crateTime=").append(crateTime);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}