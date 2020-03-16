package com.atwyy.springcloud.service;

import com.atwyy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by idea
 *
 * @author Curry
 * @version 1.0.0
 * @ClassName PaymentService.java
 * @createTime 2020年03月07日 17:43:00
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentId(@Param("id") Long id);
}
