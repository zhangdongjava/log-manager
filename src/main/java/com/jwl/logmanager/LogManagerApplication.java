package com.jwl.logmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LogManagerApplication {

    public static void main(String[] args) {
        //aaaa
        SpringApplication.run(LogManagerApplication.class);
    }

}

