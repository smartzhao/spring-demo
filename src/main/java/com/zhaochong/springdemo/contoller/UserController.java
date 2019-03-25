package com.zhaochong.springdemo.contoller;

import com.zhaochong.springdemo.dto.EISResult;
import com.zhaochong.springdemo.dto.StatusEnum;
import com.zhaochong.springdemo.dto.TmpUserDTO;
import com.zhaochong.springdemo.entity.TmpUser;
import com.zhaochong.springdemo.entity.User;
import com.zhaochong.springdemo.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("添加用户")
    @ApiImplicitParams({
            @ApiImplicitParam(required = true, name = "id", value = "用户id", paramType = "path", dataType = "string")
    })
    @GetMapping("/simple/{id}")
    public EISResult findById(@PathVariable Integer id) {

        User user = userService.findOne(id);
        if (user != null) {
            return EISResult.ok().put("data", user);
        }
        return EISResult.error(StatusEnum.NO_USER, StatusEnum.NOTFOUND.toString());
    }

    @GetMapping("/simples")
    public EISResult getAllData() {

        List<User> users = userService.getAllData();
        if (users != null) {
            return EISResult.ok().put("data", users);
        }
        return EISResult.error(StatusEnum.NO_USER, StatusEnum.NOTFOUND.toString());
    }

    @GetMapping("/api/test")
    public TmpUserDTO getUserInfo() {
        return userService.getUserInfo();
    }
}