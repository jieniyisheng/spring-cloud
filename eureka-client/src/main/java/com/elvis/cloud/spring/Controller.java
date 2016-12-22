package com.elvis.cloud.spring;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @author elviswang
 * @date 2016/12/22
 * @time 10:12
 * Desc TODO
 */
@RestController
public class Controller {
    @Autowired
    DiscoveryClient client;

    @RequestMapping("/sentence")
    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public String getSentence() {
        return
                getWord("eureka-service-subject");//大小写不区分
    }

    public String getWord(String service) {
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0) {
            URI uri = list.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri + "/getWord", String.class);
            }
        }
        return null;
    }

    private String fallbackSearchAll() {

        System.out.println("HystrixCommand fallbackMethod handle!");
        return "Hystrix Breaker!";
   }
}
