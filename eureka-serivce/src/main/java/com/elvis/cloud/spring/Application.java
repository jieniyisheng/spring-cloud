package com.elvis.cloud.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author elviswang
 * @date 2016/12/16
 * @time 15:47
 * Desc TODO
 */
@SpringBootApplication

@RefreshScope
@EnableEurekaClient
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}