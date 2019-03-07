package com.fit.fitsys.service.impl;

import com.fit.fitsys.entity.User;
import com.fit.fitsys.mapper.UserMapper;
import com.fit.fitsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User findByUsername(String username) {
        User user = new User();
        user.setUsername(username);
        return userMapper.selectOne(user);
    }

    @Override
    public int modifyPassword(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
