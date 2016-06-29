package com.csx.ssi.action;


import com.csx.ssi.entity.User;
import com.csx.ssi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by csx on 2016/6/26
 */
@Controller
@RequestMapping(value = "/user")
public class UserAction {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/register")
    public String register(User user){
        try {
            userService.register(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "forward:/jsp/main.jsp";
    }
}
