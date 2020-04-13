package com.zhaochong.dao;

import com.zhaochong.entity.TmpTag;
import com.zhaochong.entity.TmpUser;
import com.zhaochong.entity.User;
import com.zhaochong.entity.UserTest;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("SELECT * FROM user_info WHERE id=#{id}")
    User findOne(@Param("id") Integer id);

    @Select("SELECT id,name,address,salary,order_id as orderId FROM user_info")
    List<User> getAllData();

    @Select("SELECT id,name,avatar,userid,email,signature,title,`group`,tags_id as tagsId,notifyCount,unreadCount,address,phone from tmp_user WHERE id=1")
    TmpUser getUserInfo();

    @Select("SELECT * from tmp_tag WHERE tags_id=#{tagsId}")
    List<TmpTag> getTagsById(@Param("tagsId") Integer tagsId);

    @Select("SELECT * from `user`")
    @Results({

            @Result(property = "id", column = "id"),
            @Result(property = "tenantId", column = "tenant_id"),
            @Result(property = "loginName", column = "login_name"),
            @Result(property = "loginPwd", column = "login_pwd"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "permission", column = "permission"),
            @Result(property = "lastLoginTime", column = "last_login_time"),
            @Result(property = "validity", column = "validity"),
            @Result(property = "state", column = "state"),
            @Result(property = "count", column = "count"),
            @Result(property = "token", column = "token"),
            @Result(property = "remindTime", column = "remind_time"),
            @Result(property = "delFlag", column = "del_flag"),
            @Result(property = "createTime", column = "create_time")

    })
    List<UserTest> getAllUserInfo();
}
