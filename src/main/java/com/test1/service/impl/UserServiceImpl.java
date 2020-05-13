package com.test1.service.impl;

import com.test1.domain.User;
import com.test1.mapper.UserMapper;
import com.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    private UserMapper userMapper;


    @Override
    public User login(String username, String password) {
        return userMapper.login(username, password);
    }

    @Override
    public void register(String username,String password,String name) {
        userMapper.register(username,password,name);
    }

    @Override
    public User selectByName(String username) {
        return userMapper.selectByName(username);
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

}
