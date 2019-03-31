package com.zhaochong.springdemo.service.impl;

import com.zhaochong.springdemo.dao.UserDao;
import com.zhaochong.springdemo.entity.TmpTag;
import com.zhaochong.springdemo.dto.TmpUserDTO;
import com.zhaochong.springdemo.entity.TmpUser;
import com.zhaochong.springdemo.entity.User;
import com.zhaochong.springdemo.entity.UserTest;
import com.zhaochong.springdemo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findOne(Integer id) {
        //业务逻辑
        return userDao.findOne(id);
    }

    @Override
    public List<User> getAllData() {
        return userDao.getAllData();
    }

    @Override
    public TmpUserDTO getUserInfo() {
        TmpUserDTO userDTO = new TmpUserDTO();
        TmpUser userInfo = userDao.getUserInfo();

        Integer tagsId = userInfo.getTagsId();
        BeanUtils.copyProperties(userInfo,userDTO);
        List<TmpTag> bbb =userDao.getTagsById(tagsId);
        userDTO.setTags(bbb);
        return userDTO;


    }

    @Override
    public List<UserTest>  getAllUserInfo() {
        return userDao.getAllUserInfo();
    }
}
