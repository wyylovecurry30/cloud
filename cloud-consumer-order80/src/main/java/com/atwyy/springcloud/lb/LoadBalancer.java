package com.atwyy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName LoadBalancer
 * @Description
 * @Author Curry
 * @Date 2020/4/2 19:20
 * @Version 1.0
 */
public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
