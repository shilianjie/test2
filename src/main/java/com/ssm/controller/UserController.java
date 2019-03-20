package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
   private UserService userService;
    @RequestMapping("/user")
    @ResponseBody
    public List<User> queryUser(){
        List<User> list = userService.selectList();
        return list;
    }
    @ResponseBody
    @RequestMapping("/selectOrderUser")
    public Object selectOrdersUsers(){
        return userService.selcetOrderWithUser();
    }

    @ResponseBody
    @RequestMapping("/selectOrderUser2")
    public Object selectOrdersUsers2(){
        return userService.selcetOrderWithUser2();
    }

    @ResponseBody
    @RequestMapping("/selectOrderUser3")
    public Object selectOrdersUsers3(){
        return userService.selcetOrderWithUser3();
    }
}

