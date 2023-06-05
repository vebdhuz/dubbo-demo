package com.example.server.service;

import com.example.common.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello,"+name;
    }
}
