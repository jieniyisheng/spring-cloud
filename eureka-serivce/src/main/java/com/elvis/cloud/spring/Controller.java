package com.elvis.cloud.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author elviswang
 * @date 2016/12/22
 * @time 10:07
 * Desc TODO
 */
@RestController
@RefreshScope
public class Controller {
    @Value("${info.foo.name}")
    String name;

    @RequestMapping("/getWord")
    public String getWord() {
        return "Spring Cloud Netflix : " + name;
    }
}
