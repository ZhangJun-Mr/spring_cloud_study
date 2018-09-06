package com.service_ribbon.controller;

import com.service_ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    String hi(String name) {
        return helloService.hiService(name);
    }
}
