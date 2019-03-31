package com.zhaochong.springdemo.service;

import com.zhaochong.springdemo.dto.TmpUserDTO;
import com.zhaochong.springdemo.entity.User;
import com.zhaochong.springdemo.entity.UserTest;

import java.util.List;

public interface UserService {

    User findOne(Integer id);

    List<User> getAllData();

    TmpUserDTO getUserInfo();

    List<UserTest>  getAllUserInfo();
}
