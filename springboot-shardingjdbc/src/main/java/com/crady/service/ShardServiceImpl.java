package com.crady.service;

import com.crady.dao.OrderDao;
import com.crady.dao.OrderDetailDao;
import com.crady.po.Order;
import com.crady.po.OrderDetail;
import com.crady.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author :Crady
 * date :2020/05/07 14:23
 * desc :
 **/
@Service
public class ShardServiceImpl implements ShardService{

    @Autowired
    OrderDao orderDao;
    @Autowired
    OrderDetailDao orderDetailDao;

    @Transactional
    @Override
    public void insert() {
        orderDao.truncateTable();
        orderDetailDao.truncateTable();
        for (int i = 0; i < 1000; i++) {
            Order order = new Order();
            order.setUserId(i);
            order.setRemark("order remark-" + i);
            orderDao.insert(order);
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderId(order.getId());
            orderDetail.setUserId(i);
            orderDetail.setRemark("order detail remark-" + i);
            orderDetailDao.insert(orderDetail);
        }
    }

    @Transactional
    @Override
    public void truncate() {
        orderDao.truncateTable();
        orderDetailDao.truncateTable();
    }

    @Override
    public List<OrderVo> queryAll() {
        return orderDao.queryAll();
    }
}
