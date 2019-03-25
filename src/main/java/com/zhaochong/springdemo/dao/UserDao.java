package com.zhaochong.springdemo.dao;

import com.zhaochong.springdemo.entity.TmpTag;
import com.zhaochong.springdemo.entity.TmpUser;
import com.zhaochong.springdemo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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
}
