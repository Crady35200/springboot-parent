package com.crady.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * @author :Crady
 * date :2020/03/11 16:13
 * desc : 使用@PropertySource+@Value注解实现配置读取
 *    @PropertySource不支持yml文件
 **/
@Configuration
@Data
@PropertySource("classpath:jdbc.properties")
public class PropertyService {

    @Value("${db.name}")
    String name;
    @Value("${db.connection}")
    int age;
}
