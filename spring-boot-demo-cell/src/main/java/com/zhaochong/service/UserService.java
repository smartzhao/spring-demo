package com.zhaochong.service;

import com.zhaochong.dto.TmpUserDTO;
import com.zhaochong.entity.User;
import com.zhaochong.entity.UserTest;

import java.util.List;

public interface UserService {

    User findOne(Integer id);

    List<User> getAllData();

    TmpUserDTO getUserInfo();

    List<UserTest>  getAllUserInfo();
}
