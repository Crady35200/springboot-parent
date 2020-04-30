package com.crady.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Crady
 * date :2020/04/30 15:54
 * desc :
 **/
@RestController
@RequestMapping("redis")
public class RedisController {

    int n = 10;
    @RequestMapping("add")
    public int add(){
        n--;
        System.out.println(Thread.currentThread().getId() + ",n" + n);
        return n;
    }
}
