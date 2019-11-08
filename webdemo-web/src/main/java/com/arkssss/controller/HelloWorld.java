package com.arkssss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorld {


    @RequestMapping("/test")
    public String test(){


        return "template/helloworld";
    }

}
