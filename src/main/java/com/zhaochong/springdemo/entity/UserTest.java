package com.zhaochong.springdemo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(UserTest)实体类
 *
 * @author makejava
 * @since 2019-03-25 23:00:52
 */
public class UserTest implements Serializable {
    private static final long serialVersionUID = -62097247234998769L;

    private Integer id;
    //租户ID
    private Integer tenantId;
    //用户ID
    private String loginName;
    //用户密码
    private String loginPwd;
    //姓名
    private String name;
    //手机
    private String phone;
    //外键 responsibility
    private Integer permission;
    //最后一次登陆时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastLoginTime;
    //90天有效期
    private Object validity;
    //0:永久使用 1:正常使用 2:账号锁定 3:待修改密码
    private Integer state;
    //错误次数5次锁定账号
    private Integer count;
    //保存上次token
    private String token;
    //15天内首次登陆提醒
    private Object remindTime;
    //0:正常使用 1:删除
    private Integer delFlag;
    //创建时间
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Object getValidity() {
        return validity;
    }

    public void setValidity(Object validity) {
        this.validity = validity;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Object getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(Object remindTime) {
        this.remindTime = remindTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}