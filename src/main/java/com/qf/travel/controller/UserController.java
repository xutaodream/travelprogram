package com.qf.travel.controller;

import com.qf.travel.mapper.UserMapper;
import com.qf.travel.pojo.User;
import com.qf.travel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/zhuce")
    public boolean registerUser (String uname, String upwd, String email, String realname, String tel, String sex,String birth){
        User user = new User();
        user.setUname(uname);
        user.setUpwd(upwd);
        user.setEmail(email);
        user.setRealname(realname);
        user.setTel(tel);
        user.setSex(sex);
        user.setBirth(birth);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createtime = dateFormat.format(new Date());
        user.setCreatetime(createtime);
        System.out.println("user = " + user);
        boolean b = userService.save(user);
        System.out.println("b = " + b);
        return b;
    }

    @ResponseBody
    @RequestMapping("/reguname")
    public boolean registerUname(String uname){
        boolean b = userService.getUserByName(uname);
        System.out.println("b = " + b);
        return b;
    }

    @ResponseBody
    @RequestMapping("/regemail")
    public boolean registerEmail(String email){
        boolean b = userService.getUserByName(email);
        return b;
    }

    @ResponseBody
    @RequestMapping("/regetel")
    public boolean registerTel(String tel){
        boolean b = userService.getUserByName(tel);
        return b;
    }




}
