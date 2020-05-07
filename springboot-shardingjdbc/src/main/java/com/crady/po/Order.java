package com.crady.po;

import java.io.Serializable;
import lombok.Data;

/**
 * t_order_0
 * @author 
 */
@Data
public class Order implements Serializable {
    /**
     * 订单ID
     */
    private Long id;

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