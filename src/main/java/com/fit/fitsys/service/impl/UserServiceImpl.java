package com.fit.fitsys.service.impl;

import com.fit.fitsys.entity.TbUser;
import com.fit.fitsys.mapper.TbUserMapper;
import com.fit.fitsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TbUserMapper userMapper;
    @Override
    public int add(TbUser user) {
        return userMapper.insert(user);
    }

    @Override
    public TbUser findByUsername(String username) {
        TbUser user = new TbUser();
        user.setUsername(username);
        return userMapper.selectOne(user);
    }

    @Override
    public int modifyPassword(TbUser user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int update(TbUser user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int delete(String[] ids) {
        StringBuffer sb = new StringBuffer();
        for (String id : ids) {
            sb.append(id);
        }
        return userMapper.deleteByIds(sb.toString());
    }
}
