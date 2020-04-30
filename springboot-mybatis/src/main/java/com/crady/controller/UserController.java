package com.crady.controller;

import com.crady.pojo.User;
import com.crady.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Crady
 * date :2020/04/30 10:19
 * desc :
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("query/{id}")
    public User queryUser(@PathVariable int id){
        return userService.queryUserById(id);
    }
}
