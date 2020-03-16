package com.atwyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by idea
 *
 * @author Curry
 * @version 1.0.0
 * @ClassName PaymentMain8001.java
 * @createTime 2020年03月07日 16:54:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //开启服务发现注解
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
