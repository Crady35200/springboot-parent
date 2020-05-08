package com.crady.dao;

import com.crady.po.Order;
import com.crady.vo.OrderVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    int truncateTable();

    List<OrderVo> queryAll();

    List<OrderVo> queryByRemark(@Param("remark") String remark);
}