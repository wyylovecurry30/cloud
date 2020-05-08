package com.atwyy.springcloud.controller;

import com.atwyy.springcloud.entities.CommonResult;
import com.atwyy.springcloud.entities.Payment;
import com.atwyy.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignController
 * @Description
 * @Author Curry
 * @Date 2020/4/9 20:04
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment>  getPaymentId(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentId(id);
    }
}
