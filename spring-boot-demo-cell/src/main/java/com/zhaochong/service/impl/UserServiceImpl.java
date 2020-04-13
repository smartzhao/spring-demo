package com.zhaochong.service.impl;

import com.zhaochong.dao.UserDao;
import com.zhaochong.entity.TmpTag;
import com.zhaochong.dto.TmpUserDTO;
import com.zhaochong.entity.TmpUser;
import com.zhaochong.entity.User;
import com.zhaochong.entity.UserTest;
import com.zhaochong.service.UserService;
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
