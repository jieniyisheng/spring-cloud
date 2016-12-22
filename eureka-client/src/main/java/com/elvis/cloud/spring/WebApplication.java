package com.elvis.cloud.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author elviswang
 * @date 2016/12/21
 * @time 11:57
 * Desc TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class WebApplication {
    public static void main(String[] args) throws Exception {

        SpringApplication.run(WebApplication.class, args);

    }
}