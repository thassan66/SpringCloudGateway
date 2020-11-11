package com.softechnode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * Eureka Discovery Server
 * author: Taimoor Hassan
 * 11/3/2020 5:17 PM
 * com.softechnode
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServer {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServer.class);
    }
}
