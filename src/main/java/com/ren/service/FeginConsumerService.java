package com.ren.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dongao on 2018/11/20.
 * 通过@FeignClient注解指定服务名来绑定服务，这里的服务名字不区分大小写
 * 然后再通过@RequestMapping来绑定服务下的rest接口
 */

@FeignClient(name = "hello-server")
public interface FeginConsumerService {

    @RequestMapping("/hello")
    void hello();
}
