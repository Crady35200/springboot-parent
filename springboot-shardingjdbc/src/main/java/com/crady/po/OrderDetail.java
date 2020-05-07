package com.crady.po;

import java.io.Serializable;
import lombok.Data;

/**
 * t_order_detail_0
 * @author 
 */
@Data
public class OrderDetail implements Serializable {
    /**
     * 详情ID
     */
    private Long id;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}