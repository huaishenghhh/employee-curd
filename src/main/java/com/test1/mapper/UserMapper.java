package com.test1.mapper;

import com.test1.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> queryUserList();

    User login(String username, String password);

}
