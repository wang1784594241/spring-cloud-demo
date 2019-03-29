package com.mww.adminserviceconsumerfeign.controller;


import com.mww.adminserviceconsumerfeign.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class HelloController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping("/hello/msg")
    public String hello(String msg) {
        return helloClient.hello(msg);
    }

}
