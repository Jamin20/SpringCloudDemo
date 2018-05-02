package com.jamin.microservicesimpleprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/5/2 9:50
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimpleProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleProviderApplication.class, args);
    }
}
