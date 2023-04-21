package com.xhu.cep.mbg.model.admin;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class CepRolePermissonRelationship implements Serializable {
    private Long id;

    /**
     * 用户角色id外键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户角色id外键")
    private Integer roleId;

    /**
     * 描述
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "描述")
    private String descripation;

    /**
     * 项目权限
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "项目权限")
    private Integer projectPermissonId;

    /**
     * 用户权限
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户权限")
    private Long userPermissonId;

    /**
     * 名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 后台用户数量
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "后台用户数量")
    private Integer adminCount;

    /**
     * 启用状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "启用状态")
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
    private Date crateTime;

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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        sb.append(", descripation=").append(descripation);
        sb.append(", projectPermissonId=").append(projectPermissonId);
        sb.append(", userPermissonId=").append(userPermissonId);
        sb.append(", name=").append(name);
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