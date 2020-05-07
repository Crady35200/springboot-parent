package com.crady;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(basePackages = "com.crady.dao")
public class SpringbootShardingjdbcApplication implements ApplicationContextAware {

    static ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardingjdbcApplication.class, args);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(names);
        }
        System.out.println(applicationContext.getBean(DataSource.class));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
