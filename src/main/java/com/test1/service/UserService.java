package com.test1.service;


import com.test1.domain.User;

public interface UserService {

    User login(String username,String password);

    void register(String username,String password,String name);

    User selectByName(String username);
}
