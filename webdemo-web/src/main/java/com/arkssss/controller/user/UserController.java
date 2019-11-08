package com.arkssss.controller.user;

import com.arkssss.pojo.User;
import com.arkssss.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody User getUser(@PathVariable Integer id){
        System.out.println("in");



        return userService.getUserById(id);
    }






}
