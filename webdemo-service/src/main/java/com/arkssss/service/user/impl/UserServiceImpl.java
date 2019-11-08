package com.arkssss.service.user.impl;

import com.arkssss.service.user.UserService;
import com.arkssss.dao.user.UserMapper;
import com.arkssss.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User getUserById(Integer id) {

        return userMapper.getUserById(id);
    }
}
