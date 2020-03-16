package com.atwyy.springcloud.dao;

import com.atwyy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by idea
 *
 * @author Curry
 * @version 1.0.0
 * @ClassName PaymentDao.java
 * @createTime 2020年03月07日 17:15:00
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentId(@Param("id") Long id);
}
