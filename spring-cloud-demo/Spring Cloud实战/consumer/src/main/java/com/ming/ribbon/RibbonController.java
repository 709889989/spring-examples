package com.ming.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping("hello")
    public String hello(){
        return template.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }
    //服务降级处理
    private String fallback(){
        return "服务调用异常";
    }
}
