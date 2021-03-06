package com.atwyy.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by idea
 *
 * @author Curry
 * @version 1.0.0
 * @ClassName ApplicationContextConfig.java
 * @createTime 2020年03月08日 18:59:00
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //关闭注解使用自己写的负载均衡@LoadBalanced   //开启RestTemplate的负载均衡能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
