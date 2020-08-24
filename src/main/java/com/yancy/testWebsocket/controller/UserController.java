package com.yancy.testWebsocket.controller;


import com.yancy.testWebsocket.entity.User;
import com.yancy.testWebsocket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll(){
            return userService.findAll();
    }
}
