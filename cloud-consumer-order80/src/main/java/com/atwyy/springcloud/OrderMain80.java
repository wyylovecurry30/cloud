package com.atwyy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by idea
 *
 * @author Curry
 * @version 1.0.0
 * @ClassName OrderMain80.java
 * @createTime 2020年03月07日 19:12:00
 */
@SpringBootApplication
@EnableEurekaClient
//改用自己配置的负载均衡规则
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
