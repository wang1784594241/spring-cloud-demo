package com.mww.admin.service.consume.rribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.LinkedHashMap;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod  = "error")
    public String hello(String msg) {
        HashMap<String, Object> map = new LinkedHashMap<>();
        map.put("msg", msg);
        return restTemplate.getForObject("http://admin-service/hello/msg?msg={msg}", String.class, map);
    }

    public String error(String msg){
        return String.format("error msg:%s", msg);
    }
}
