package com.mww.adminserviceconsumerfeign.client;


import com.mww.adminserviceconsumerfeign.client.hystrixes.HelloClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "admin-service", fallback = HelloClientHystrix.class)
public interface HelloClient {

    @GetMapping(value = "/hello/msg")
    String hello(@RequestParam(value = "msg") String msg);
}
