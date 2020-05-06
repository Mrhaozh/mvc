package com.hzh.mvc.controller;

import com.alibaba.fastjson.JSON;
import com.hzh.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 先示所有用戶信息
     * @return
     */
    @RequestMapping("/user")
    @ResponseBody
    public String listUsers(){
        String users = JSON.toJSONString(userService.listUsers());
        return users;
    }
}