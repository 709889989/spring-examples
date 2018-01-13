package com.ming.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="hello-service", fallback = HelloServiceFallback.class)
public interface HelloService {

    @RequestMapping("hello")
    String hello();

    @RequestMapping("helloHeader")
    String helloHeader(@RequestHeader("name") String name);

    @RequestMapping("helloParam")
    String helloParam(@RequestParam("param") String param);

    @RequestMapping("helloBody")
    String helloBody(@RequestBody User user);
}
