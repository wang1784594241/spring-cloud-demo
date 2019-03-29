package com.mww.adminserviceconsumerfeign.client.hystrixes;

import com.mww.adminserviceconsumerfeign.client.HelloClient;
import org.springframework.stereotype.Component;

@Component
public class HelloClientHystrix implements HelloClient {

    @Override
    public String hello(String msg) {
        return "看到这个说明接口请求失败了 msg:" + msg;
    }
}
