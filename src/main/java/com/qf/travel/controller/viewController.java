package com.qf.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {
    @RequestMapping("loginview")
    private String loginview(){
        return "login";
    }

    @RequestMapping("registerview")
    private String registerview(){
        return "register";
    }

    @RequestMapping("headerview")
    private String headerview(){
        return "header";
    }

    @RequestMapping("mainview")
    private String mainview(){
        return "main";
    }
}
