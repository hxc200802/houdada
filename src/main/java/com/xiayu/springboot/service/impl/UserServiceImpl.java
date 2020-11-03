package com.xiayu.springboot.service.impl;
import java.util.Date;
import java.util.List;

import com.xiayu.springboot.domain.UserExample;
import com.xiayu.springboot.domain.UserPo;
import com.xiayu.springboot.mapper.UserMapper;
import com.xiayu.springboot.service.UserService;
import com.xiayu.springboot.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @version v1.0.0
 * @Author xiayu
 * @Date 2020/11/3 13:35
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;
    @Override
    public int createUser(String userName, String password, String tel) {
        UserPo userPo = new UserPo();
        userPo.setId(MapperUtils.buildUUID());
        userPo.setLoginName(userName);
        //todo 密码加密
        userPo.setPassword(passwordEncoder.encode(password));
        userPo.setType(0);
        userPo.setTel(tel);
        userPo.setUserNumber("");
        userPo.setUserStatus(0);
        userPo.setLastTime(new Date());
        userPo.setCreateTime(new Date());
        userPo.setUpdateTime(new Date());
        userPo.setDelFlag(0);

        return userMapper.insert(userPo);
    }

    @Override
    public UserPo selectUserByName(String userName) {

        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andLoginNameEqualTo(userName)
                .andDelFlagEqualTo(0);
        List<UserPo> userPos = userMapper.selectByExample(userExample);

        UserPo userPo = userMapper.selectByUserName(userName);

        return userPos.get(0);
    }
}
