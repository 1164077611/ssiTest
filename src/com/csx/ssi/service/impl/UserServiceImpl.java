package com.csx.ssi.service.impl;


import com.csx.ssi.dao.UserMapper;
import com.csx.ssi.entity.User;
import com.csx.ssi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by csx on 2016/6/26
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public int register(User user) throws Exception{
        int i=0;
        i=userDao.register(user);
//        Integer.parseInt("aa");
        return i;
    }

    @Override
    public User login(User user) throws Exception{
        return userDao.login(user);
    }
}
