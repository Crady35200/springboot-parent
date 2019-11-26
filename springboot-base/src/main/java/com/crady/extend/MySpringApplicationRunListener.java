package com.crady.extend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * @author :Crady
 * date :2019/11/26 9:14
 * desc :
 **/
@Slf4j
@Order(0)
public class MySpringApplicationRunListener implements SpringApplicationRunListener {


//      public EventPublishingRunListener(SpringApplication application, String[] args) {
    public MySpringApplicationRunListener(SpringApplication application, String[] args) {
        log.info("init ***************");
    }

    @Override
    public void starting() {
        log.info("MySpringApplicationRunListener starting...");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        log.info("MySpringApplicationRunListener environmentPrepared...");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("MySpringApplicationRunListener contextPrepared...");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("MySpringApplicationRunListener contextLoaded...");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        log.info("MySpringApplicationRunListener started...");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        log.info("MySpringApplicationRunListener running...");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.info("MySpringApplicationRunListener failed...");
    }
}
