package com.atwyy.springcloud.service.impl;

import com.atwyy.springcloud.dao.PaymentDao;
import com.atwyy.springcloud.entities.Payment;
import com.atwyy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by idea
 *
 * @author Curry
 * @version 1.0.0
 * @ClassName PaymentServiceImpl.java
 * @createTime 2020年03月07日 17:44:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentId(Long id){
        return paymentDao.getPaymentId(id);
    }
}
