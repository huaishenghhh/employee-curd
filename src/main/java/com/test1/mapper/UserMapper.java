package com.test1.mapper;

import com.test1.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User login(String username, String password);


    void register(String username, String password, String email);

    User selectByName(String username);

}
