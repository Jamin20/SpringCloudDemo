package com.jamin.microserviceconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/4/26 17:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfigClientApplication.class, args);
    }
}
