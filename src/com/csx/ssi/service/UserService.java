package com.csx.ssi.service;


import com.csx.ssi.entity.User;

/**
 * Created by csx on 2016/6/26
 */
public interface UserService {
    /**
     * 注册
     * @param user
     * @return
     */
    public int register(User user) throws Exception;

    /**
     * 登录
     * @param user
     * @return
     */
    public User login(User user) throws Exception;
}
