package com.crady;

import com.crady.dao.OrderDao;
import com.crady.dao.OrderDetailDao;
import com.crady.po.Order;
import com.crady.po.OrderDetail;
import com.crady.service.ShardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootShardingjdbcApplicationTests {

    @Autowired
    ShardService shardService;

    /**
     * 测试分库分表
     */
    @Test
    void test() {
        shardService.truncate();
        shardService.insert();
    }

    /**
     * 清空数据
     */
    @Test
    void clear(){
        shardService.truncate();
    }

}
