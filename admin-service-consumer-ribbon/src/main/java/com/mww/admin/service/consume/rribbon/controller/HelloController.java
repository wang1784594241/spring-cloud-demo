package com.mww.admin.service.consume.rribbon.controller;


import com.mww.admin.service.consume.rribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello/msg")
    public String hello(String msg) {
        return helloService.hello(msg);
    }
}
