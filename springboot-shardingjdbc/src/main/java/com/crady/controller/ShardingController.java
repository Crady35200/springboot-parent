package com.crady.controller;

import com.crady.service.ShardService;
import com.crady.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :Crady
 * date :2020/05/07 14:21
 * desc :
 **/
@RestController
@RequestMapping("shard")
public class ShardingController {
    @Autowired
    ShardService shardService;

    @RequestMapping("insert")
    public String insert(){
        shardService.insert();
        return "insert success";
    }
    @RequestMapping("clear")
    public String clear(){
        shardService.truncate();
        return "clear success";
    }

    @RequestMapping("order")
    public List<OrderVo> all(){
        List<OrderVo> orderVos = shardService.queryAll();
        return orderVos;
    }
}
