package com.ming.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${from}")
    private String from;
    @Autowired
    private Environment env;
    @Value("${over}")
    private String overrides;

    @RequestMapping("test")
    public String test(){
        System.out.println(from);
        return from + ":" + overrides;
    }

    @RequestMapping("testEnv")
    public String testEnv(){
        String from = env.getProperty("from");
        System.out.println("Environment from:" + from);
        return from;
    }
}
