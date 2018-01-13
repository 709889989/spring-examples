package com.ming.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    public String hello(){
        return helloService.hello();
    }

    @RequestMapping("helloHeader")
    public String helloHeader(){
        return helloService.helloHeader("name");
    }

    @RequestMapping("helloParam")
    public String helloParam(){
        return helloService.helloParam("param");
    }

    @RequestMapping("helloBody")
    public String helloBody(){
        User user = new User("name", "age");
        return helloService.helloBody(user);
    }
}
