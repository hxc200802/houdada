package com.xiayu.springboot.controller;

import com.xiayu.springboot.domain.UserPo;
import com.xiayu.springboot.entity.ResponseResult;
import com.xiayu.springboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 *
 * @version v1.0.0
 * @Author xiayu
 * @Date 2020/11/3 13:33
 */
@Api(tags = "用户")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //@PostMapping()
    @ApiOperation("添加用户")
    @GetMapping(value = "createUser/{userName}/{password}/{tel}")
    public ResponseResult<Integer> createUser(@PathVariable String userName, @PathVariable String password, @PathVariable String tel, HttpServletRequest request ){

        int user = userService.createUser(userName, password, tel);
        return new ResponseResult(ResponseResult.CodeStatus.OK,"添加用户",user);
    }

    @ApiOperation("获取用户")
    @GetMapping(value = "selectUserByName/{userName}")
    public ResponseResult<UserPo> selectUserByName(@PathVariable String userName ){

        UserPo userPo = userService.selectUserByName(userName);
        return new ResponseResult(ResponseResult.CodeStatus.OK,"获取用户",userPo);
    }


}
