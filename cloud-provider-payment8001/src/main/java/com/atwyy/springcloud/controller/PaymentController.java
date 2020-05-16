package com.atwyy.springcloud.controller;

import com.atwyy.springcloud.entities.CommonResult;
import com.atwyy.springcloud.entities.Payment;
import com.atwyy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by idea
 *
 * @author Curry
 * @version 1.0.0
 * @ClassName PaymentController.java
 * @createTime 2020年03月07日 17:52:00
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("结果**"+result);
        if (result > 0) {
            return new CommonResult(200,"查询成功,serverPort:  "+serverPort,result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentId(@PathVariable("id") Long id) {
        Payment paymentId = paymentService.getPaymentId(id);
        log.info("结果**"+paymentId);

        if (paymentId!=null) {
            return new CommonResult(200,"查询成功,serverPort:  "+serverPort,paymentId);
        }else {
            return new CommonResult(444,"没有记录，id"+id+"不存在",null);
        }
    }
    @GetMapping("/payment/discovery")
    public Object discovery(){
        //得到服务清单列表
        List<String> services = discoveryClient.getServices();
        for (String element : services){
            log.info("element******"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances){
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
