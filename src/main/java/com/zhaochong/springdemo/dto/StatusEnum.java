package com.zhaochong.springdemo.dto;

import java.io.Serializable;

/**
 * 返回状态
 */
public enum StatusEnum implements Serializable {
    SUCC("成功"),
    FAIL("失败"),
    PERMISSION("没有操作权限"),
    //未登录
    UNLOGIN("请先登录"),
    //服务器异常
    ERROR("服务器出现异常"),
    //密码错误
    UNPASSWD("原密码不正确"),
    //未填写必要参数  205
    UNPARAM("请输入必要参数"),
    //登陆失败
    LOGINFAIL("用户名或密码错误"),
    //锁定 202
    LOCK("用户被锁定"),
    //首次登陆 203
    FIRSTLOGIN("首次登陆,请修改密码"),
    //修改密码警告 204
    PSSWDWARN("请及时修改密码"),
    // 没有符合条件的数据,2005
    NOTFOUND("未查询到数据"),
    // 权限组已经存在 code 210
    EXISTRESNAME("权限组的名称已经存在"),

    // 权限组已经存在 code 309
    DATABASEERROR("数据库操作错误");
    private String status;
    public static final int NO_USER =2005;

    private StatusEnum(String status) {
        this.status = status;
    }

    public String getName() {
        return status;
    }

    public String toString() {
        return status;
    }
}