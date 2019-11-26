package com.crady.indicator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @author :Crady
 * date :2019/11/26 11:19
 * desc : 自定义监控指标(可以通过/health指标访问)
 **/
@Component
public class WwwIndicator extends AbstractHealthIndicator {

    private static final String BAIDU_HOST = "www.baidu.com";

    private static final int TIMT_OUT = 3000;

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        if(ping()){
            builder.withDetail("message","当前服务器可以访问百度").up();
        }else{
            builder.withDetail("message","当前服务器无法访问百度").outOfService();
        }
    }

    private boolean ping(){
        boolean reachable = false;
        try {
            reachable = InetAddress.getByName(BAIDU_HOST).isReachable(TIMT_OUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reachable;
    }
}
