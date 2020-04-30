package com.crady;

import org.junit.jupiter.api.Test;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringbootRedisApplicationTests {
    @Autowired
    RedissonClient redissonClient;
    CountDownLatch countDownLatch = new CountDownLatch(100);
    int n = 0;
    CyclicBarrier cyclicBarrier = new CyclicBarrier(100,()->{
        System.out.println("********************准备就绪开始运行********************n=" + n);
    });


    @Test
    void contextLoads() throws InterruptedException {
        RLock lock = redissonClient.getLock("lock");
        System.out.println("开始执行n=" + n);
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    cyclicBarrier.await();
                    lock.lock();
                    for (int j = 0; j < 100000; j++) {
                        n++;
                    }
                    countDownLatch.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }).start();
        }
        countDownLatch.await();
        System.out.println("执行完成n=" + n);
    }

}
