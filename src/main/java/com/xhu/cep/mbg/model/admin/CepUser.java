package com.xhu.cep.mbg.model.admin;

import java.io.Serializable;
import java.util.Date;

public class CepUser implements Serializable {
    private Long id;

    /**
     * 用户名
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 用户密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 头像
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * 用户电子邮件地址
     *
     * @mbggenerated
     */
    private String email;

    /**
     * 昵称
     *
     * @mbggenerated
     */
    private String nickName;

    /**
     * 用户角色标识
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * 备注信息
     *
     * @mbggenerated
     */
    private String note;

    /**
     * 最后登录时间
     *
     * @mbggenerated
     */
    private Date loginTime;

    /**
     * 登录次数
     *
     * @mbggenerated
     */
    private Integer loginTimes;

    /**
     * 状态，0>禁用，1启动
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 用户信息更新时间
     *
     * @mbggenerated
     */
    private Date updatedAt;

    /**
     * 用户创建时间
     *
     * @mbggenerated
     */
    private Date createdAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", icon=").append(icon);
        sb.append(", email=").append(email);
        sb.append(", nickName=").append(nickName);
        sb.append(", roleId=").append(roleId);
        sb.append(", note=").append(note);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", loginTimes=").append(loginTimes);
        sb.append(", status=").append(status);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}