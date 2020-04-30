package com.crady;

import com.crady.pojo.User;
import com.crady.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class SpringbootMybatisApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void testQuery(){
        User user = userService.queryUserById(8);
        log.info("user:{}",user);
    }

    @Test
    void contextLoads() {
    }

}
