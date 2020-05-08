package com.atwyy.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentService
 * @Description
 * @Author Curry
 * @Date 2020/4/14 11:20
 * @Version 1.0
 */
@Service

public class PaymentService {
    //正常访问
    public String paymentInfo_OK(Integer id){
        return "线程池： "+Thread.currentThread().getName()+" paymentInfo_OK,id: "+id+"\t"+"hh ";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            //设置自身调用超时时间的峰值(value = "5000")ms，峰值内可以正常运行，超过了需要有兜底的方法处理，作服务降级fallback
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id){

        int a = 10/0;
        int timeNumber = 3;//超时时间
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： "+Thread.currentThread().getName()+" paymentInfo_TimeOut,id: "+id+"\t"+"哈哈哈"+"耗时： "+timeNumber+"秒";
    }
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池： "+Thread.currentThread().getName()+" 8001系统繁忙或出错，请稍后重试,id: "+id+"\t"+"哭唧唧";
    }
}
