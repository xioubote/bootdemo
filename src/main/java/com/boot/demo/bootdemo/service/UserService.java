package com.boot.demo.bootdemo.service;

import com.boot.demo.bootdemo.domain.User;
import com.boot.demo.bootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: yanyfa
 * @Date: 2019/3/12 14:31
 * @Description:
 */

@Service
public class UserService{
    @Autowired
    private UserMapper userMapper;

    public List<User> listAll() {
        return userMapper.selectAll();
    }

    public int save(User user){
        return userMapper.insert(user);
    }
}
