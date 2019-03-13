package com.fit.fitsys.service;

import com.fit.fitsys.entity.TbUser;

public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    int add(TbUser user);

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    TbUser findByUsername(String username);

    /**
     * 更新密码
     * @param user
     * @return
     */
    int modifyPassword(TbUser user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int update(TbUser user);

    /**
     * 更加id批量删除用户
     * @param ids
     */
    int delete(String[] ids);
}
