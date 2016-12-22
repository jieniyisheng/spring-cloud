package com.elvis.cloud.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author elviswang
 * @date 2016/12/21
 * @time 11:00
 * Desc TODO
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServer.class, args);

    }

}