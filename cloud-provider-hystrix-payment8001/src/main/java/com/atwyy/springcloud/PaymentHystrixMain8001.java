package com.atwyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentHystrixMain8001
 * @Description
 * @Author Curry
 * @Date 2020/4/14 11:18
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//主启动类的激活
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }
}
