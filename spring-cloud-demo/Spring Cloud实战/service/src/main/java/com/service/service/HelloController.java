package com.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("hello")
    public String hello(){
        logger.info("hello");
        return "hello world";
    }

    @RequestMapping("helloHeader")
    public String helloHeader(@RequestHeader String name){
        return "header: " + name;
    }
    @RequestMapping("helloParam")
    public String helloParam(@RequestParam String param){
        return "param: " + param;
    }
    @RequestMapping("helloBody")
    public String helloBody(@RequestBody User user){
        return user.getAge() + user.getName();
    }
}
