package com.ming.feign;//package com.ming.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务出错降级处理类
 */
@Component
public class HelloServiceFallback implements HelloService{
    @Override
    public String hello() {
        return "Error";
    }

    @Override
    public String helloHeader(@RequestHeader("name") String name) {
        return "Error";
    }

    @Override
    public String helloParam(@RequestParam("param") String param) {
        return "Error";
    }

    @Override
    public String helloBody(@RequestBody User user) {
        return "Error";
    }
}
