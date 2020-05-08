package com.crady.service;

import com.crady.vo.OrderVo;

import java.util.List;

/**
 * @author :Crady
 * date :2020/05/07 14:22
 * desc :
 **/
public interface ShardService {

    void insert();
    void truncate();
    List<OrderVo> queryAll();

    List<OrderVo> queryByRemark(String remark);
}
