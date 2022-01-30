package com.yue.service;

import com.yue.dao.UserDao;
import com.yue.pojo.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 岳岳
 * version  1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;
    @Override
    public User login(User user) {
        //进行MD5加密
        String s = DigestUtils.md5Hex(user.getUserpassword());
        user.setUserpassword(s);
        User user1 = userDao.find(user);
        return user1;
    }

    @Override
    public int reg(User user) {
        //进行MD5加密
        String s = DigestUtils.md5Hex(user.getUserpassword());
        user.setUserpassword(s);
        int add = userDao.add(user);
        return add;
    }

    @Override
    public int update(User user) {
        return 0;
    }
}
