package com.softechnode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/*
 * Gateway Service
 * author: Taimoor Hassan
 * 11/3/2020 7:20 PM
 * com.softechnode
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
