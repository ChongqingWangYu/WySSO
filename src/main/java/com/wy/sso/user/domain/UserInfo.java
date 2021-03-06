package com.wy.sso.user.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangyu
 * @title: User
 * @projectName WyUpms
 * @description: TODO
 * @date 2020/4/20 18:49
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String token;
    private String roleNames;
    private String depName;
    private List<RoleInfo> roles;
    private List<UserPermissionInfo> permissionInfoList;
    /*db*/
    private Integer flowId;
    private String userName;
    private String petName;
    private String password;
    private String avatar;
    private String activated;
    private String createTime;

    public String getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public List<UserPermissionInfo> getPermissionInfoList() {
        return permissionInfoList;
    }

    public void setPermissionInfoList(List<UserPermissionInfo> permissionInfoList) {
        this.permissionInfoList = permissionInfoList;
    }

    public List<RoleInfo> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleInfo> roles) {
        this.roles = roles;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
