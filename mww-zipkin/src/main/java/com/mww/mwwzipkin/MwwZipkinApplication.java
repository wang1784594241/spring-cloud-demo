package com.mww.mwwzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class MwwZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MwwZipkinApplication.class, args);
    }

}
