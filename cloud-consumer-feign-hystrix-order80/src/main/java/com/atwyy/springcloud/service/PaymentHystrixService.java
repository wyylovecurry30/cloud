package com.atwyy.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentHystrixService
 * @Description
 * @Author Curry
 * @Date 2020/4/22 19:56
 * @Version 1.0
 */
@Component
//统一设置fallback
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public abstract class PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public abstract String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public abstract String paymentInfo_TimeOut(@PathVariable("id") Integer id);

}
