package com.xhu.cep.mbg.model.admin;

import java.io.Serializable;
import java.util.Date;

public class CepRolePermissonRelationship implements Serializable {
    private Long id;

    /**
     * 用户角色id外键
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * 名称
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
     * 项目权限
     *
     * @mbggenerated
     */
    private Integer projectPermissonId;

    /**
     * 用户权限
     *
     * @mbggenerated
     */
    private Long userPermissonId;

    /**
     * 后台用户数量
     *
     * @mbggenerated
     */
    private Integer adminCount;

    /**
     * 启用状态
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

    public Integer getProjectPermissonId() {
        return projectPermissonId;
    }

    public void setProjectPermissonId(Integer projectPermissonId) {
        this.projectPermissonId = projectPermissonId;
    }

    public Long getUserPermissonId() {
        return userPermissonId;
    }

    public void setUserPermissonId(Long userPermissonId) {
        this.userPermissonId = userPermissonId;
    }

    public Integer getAdminCount() {
        return adminCount;
    }

    public void setAdminCount(Integer adminCount) {
        this.adminCount = adminCount;
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
        sb.append(", roleId=").append(roleId);
        sb.append(", name=").append(name);
        sb.append(", descripation=").append(descripation);
        sb.append(", projectPermissonId=").append(projectPermissonId);
        sb.append(", userPermissonId=").append(userPermissonId);
        sb.append(", adminCount=").append(adminCount);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", crateTime=").append(crateTime);
        sb.append(", updataTime=").append(updataTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}