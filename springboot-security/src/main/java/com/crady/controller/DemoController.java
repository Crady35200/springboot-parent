package com.crady.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Crady
 * date :2019/11/21 14:47
 * desc :
 **/
@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello World !";
    }

    @RequestMapping("nihao")
    public String nihao(){
        return "你好 !";
    }

    @RequestMapping("nice")
    public String nice(){
        return "NICE!";
    }
}
