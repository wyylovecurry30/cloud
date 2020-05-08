package com.atwyy.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description 处理PaymentHystrixService接口调用失败后的fallback
 * @Author Curry
 * @Date 2020/5/4 20:02
 * @Version 1.0
 */
@Component
public class PaymentFallbackService extends PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fallback paymentInfo_OK,哭唧唧";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fallback paymentInfo_TimeOut,哭唧唧";
    }
}
