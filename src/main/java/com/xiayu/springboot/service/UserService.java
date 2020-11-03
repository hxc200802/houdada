package com.xiayu.springboot.service;

import com.xiayu.springboot.domain.UserPo;

/**
 * Description:
 *
 * @version v1.0.0
 * @Author xiayu
 * @Date 2020/11/3 13:34
 */
public interface UserService {
    int createUser(String userName, String password, String tel);

    UserPo selectUserByName(String userName);
}
