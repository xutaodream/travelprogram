package com.qf.travel.service.impl;

import com.qf.travel.mapper.UserMapper;
import com.qf.travel.pojo.User;
import com.qf.travel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean getUserByName(String uname) {
        System.out.println("uname = " + uname);
        User user = userMapper.getUserByName(uname);
        System.out.println("user = " + user);
        return user!=null?true:false;
    }

    @Override
    public boolean getUserByTel(String tel) {
        User user = userMapper.getUserByTel(tel);
        return user!=null?true:false;
    }

    @Override
    public boolean getUserByEmail(String email) {
        User user = userMapper.getUserByEmail(email);
        return user!=null?true:false;
    }

    @Override
    public boolean save(User user) {
        System.out.println("user = " + user);
        int count = userMapper.save(user);
        return count>0?true:false;
    }
}
