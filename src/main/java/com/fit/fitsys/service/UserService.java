package com.fit.fitsys.service;

import com.fit.fitsys.entity.User;

public interface UserService {
    int add(User user);

    User findByUsername(String username);
}
