package com.mww.mwwgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
//@EnableDiscoveryClient
@SpringCloudApplication
public class MwwGatewayApplication {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/feign/**")
                        .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(1))
                        .uri("lb://admin-consumer-feign")
                )
                .route(p -> p
                        .path("/ribbon/**")
                        .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(1))
                        .uri("lb://admin-consumer-ribbon")
                )
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(MwwGatewayApplication.class, args);
    }

}
