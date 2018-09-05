package com.eureka_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    String home(@RequestParam("name") String name) {
        return "hi " + name + ", i am from port: " + port;
    }
}