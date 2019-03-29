package com.mww.adminservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/msg")
    public String msg(String msg) {
        return String.format("get method port:%s hello you say:%s", port, msg);
    }

    @PostMapping("/msg")
    public String hello2(String msg) {
        return String.format("post method port:%s hello you say:%s", port, msg);
    }

    @GetMapping
    public String test(String msg) {
        return "2";
    }
}
