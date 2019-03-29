package com.mww.admin.service.consume.rribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringCloudApplication
@EnableHystrix
public class AdminServiceConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServiceConsumerRibbonApplication.class, args);
    }

}
