package com.crady.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author :Crady
 * date :2020/05/07 18:05
 * desc :
 **/
@Data
public class OrderVo implements Serializable {

    /**
     * 订单ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 订单备注
     */
    private String remark;

    /**
     * 订单详情ID
     */
    private Long detailId;

    /**
     * 订单详情备注
     */
    private String DetailRemark;
}
