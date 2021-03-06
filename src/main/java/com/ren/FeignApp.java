package com.ren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by dongao on 2018/11/20.
 * 通过@EnableFeignClients来开启spring cloud feign的支持功能
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class,args);
    }

}
