package com.whale.lms.mapper;

import com.whale.lms.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    void insertUser(@Param("username") String username, @Param("password") String password);

    User getUser(@Param("username") String username, @Param("password") String password);

    User getUserById(@Param("id") Integer id);

    Integer getUserCountByName(@Param("username") String username);
}
