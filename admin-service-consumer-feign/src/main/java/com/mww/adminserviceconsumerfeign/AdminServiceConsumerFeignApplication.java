package com.mww.adminserviceconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
//@SpringBootApplication
//@EnableDiscoveryClient
@SpringCloudApplication//上两个注解合一版
public class AdminServiceConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServiceConsumerFeignApplication.class, args);
    }

}
