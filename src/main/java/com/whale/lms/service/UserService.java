package com.whale.lms.service;

import com.whale.lms.pojo.User;

public interface UserService {

    User getUser(String username, String password);

    void insertUser(String username, String password);

    User getUserById(Integer id);

    Integer getUserCountByName(String username);
}
