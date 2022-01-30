package com.yue.service;

import com.yue.pojo.User;

import java.util.List;

/**
 * @author 岳岳
 * version  1.0
 */
public interface UserService {
    User login(User user);
    int reg(User user);
    int update (User user);
}
