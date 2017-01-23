package com.allstate.controller;

import com.allstate.entities.User;
import com.allstate.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value="/users")
public class UserController {

    private UserServices service;

    @Autowired
    public void setService(UserServices service){
        this.service = service;
    }

    //POST of a product
    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return this.service.create(user);
    }

}
