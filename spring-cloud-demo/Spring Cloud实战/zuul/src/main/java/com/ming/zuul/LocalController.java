package com.ming.zuul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalController {
    @RequestMapping("/local/hello")
    public String local(){
        return "本地跳转";
    }
}
