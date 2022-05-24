package com.whale.lms.service.impl;

import com.whale.lms.mapper.UserMapper;
import com.whale.lms.pojo.User;
import com.whale.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUser(String username, String password) {
        return userMapper.getUser(username, password);
    }

    @Override
    public void insertUser(String username, String password) {
        userMapper.insertUser(username, password);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public Integer getUserCountByName(String username) {
        return userMapper.getUserCountByName(username);
    }
}
