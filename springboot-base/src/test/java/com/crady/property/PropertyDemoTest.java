package com.crady.property;

import com.crady.SpringbootBaseApplication;
import com.crady.controller.DemoController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author :Crady
 * date :2020/03/11 16:14
 * desc :
 **/
@SpringBootTest(classes = SpringbootBaseApplication.class)
@Slf4j
public class PropertyDemoTest {

    @Autowired
    PropertyService propertyService;
    @Autowired
    PropertyValueService propertyValueService;
    @Autowired
    ConfigurationPropertyService configurationPropertyService;

    @Test
    public void demo1(){
        log.info("*******{}",propertyService);
        log.info("*******{}",propertyValueService);
        log.info("*******{}",configurationPropertyService);
    }
}