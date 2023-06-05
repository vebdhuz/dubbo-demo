package com.example.client.controller;

import com.example.common.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference(retries = 0)
    HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello("abc");
    }
}
