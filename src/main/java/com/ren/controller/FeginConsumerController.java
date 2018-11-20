package com.ren.controller;

import com.ren.service.FeginConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dongao on 2018/11/20.
 */
@RestController
public class FeginConsumerController {
    @Autowired
    FeginConsumerService feginConsumerService;

    @RequestMapping("fegin-consumer")
    public String feginConsumer(){
        feginConsumerService.hello();
        return "fegin consumer finish!!!";
    }


}
