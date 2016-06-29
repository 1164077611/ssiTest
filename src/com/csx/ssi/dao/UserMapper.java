package com.csx.ssi.dao;


import com.csx.ssi.entity.User;

/**
 * Created by csx on 2016/6/26
 */
public interface UserMapper {
    /**
     * 注册
     * @param user
     * @return
     */
    public int register(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    public User login(User user);

}
