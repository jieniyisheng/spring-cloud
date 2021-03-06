package com.elvis.cloud.spring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author elviswang
 * @date 2016/12/16
 * @time 15:47
 * Desc TODO
 */
@SpringBootApplication
@RestController
@RefreshScope
public class Application {
    @Value("${info.foo.name}")
    String bar;

    @RequestMapping("/")
    String hello() {
        return "Hello " + bar + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}