package com.crady.extend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author :Crady
 * date :2019/11/26 9:14
 * desc :
 **/
@Slf4j
@Order(1)
public class SecondSpringApplicationRunListener implements SpringApplicationRunListener {


//      public EventPublishingRunListener(SpringApplication application, String[] args) {
    public SecondSpringApplicationRunListener(SpringApplication application, String[] args) {
        log.info("init ***************");
    }

    @Override
    public void starting() {
        log.info("SecondSpringApplicationRunListener starting...");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        log.info("SecondSpringApplicationRunListener environmentPrepared...");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("SecondSpringApplicationRunListener contextPrepared...");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("SecondSpringApplicationRunListener contextLoaded...");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        log.info("SecondSpringApplicationRunListener started...");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        log.info("SecondSpringApplicationRunListener running...");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.info("SecondSpringApplicationRunListener failed...");
    }
}
