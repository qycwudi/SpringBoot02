package com.springbootdemo02.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qyc
 * @time 2020/4/7 - 5:02
 */

@Controller
@RequestMapping("/qyc")
public class UserController {
    @GetMapping("/login")
    public String login(){
        System.out.println("login controller");
        return "template01";
    }
}
