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
public class SpringbootShardingjdbcApplication{

    static ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardingjdbcApplication.class, args);
    }
}
