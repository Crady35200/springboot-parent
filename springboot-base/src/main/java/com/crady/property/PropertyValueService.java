package com.crady.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author :Crady
 * date :2020/03/11 16:13
 * desc : 使用@Value读取配置
 **/
@Configuration
@Data
public class PropertyValueService {

    @Value("${name}")
    String name;
    @Value("${age}")
    int age;
}
