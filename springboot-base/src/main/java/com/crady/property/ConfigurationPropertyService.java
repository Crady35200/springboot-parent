package com.crady.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author :Crady
 * date :2020/03/11 16:13
 * desc : 使用@PropertySource+@ConfigurationProperties实现配置读取
 *    @PropertySource不支持yml文件
 *    而且使用@ConfigurationProperties必须添加以下依赖包，不然会有警告
 *            <dependency>
 *             <groupId>org.springframework.boot</groupId>
 *             <artifactId>spring-boot-configuration-processor</artifactId>
 *             <optional>true</optional>
 *         </dependency>
 **/
@Configuration
@PropertySource("classpath:jdbc.properties")
@ConfigurationProperties(prefix = "db")
@Data
public class ConfigurationPropertyService {

    String name;
    int connection;
}
