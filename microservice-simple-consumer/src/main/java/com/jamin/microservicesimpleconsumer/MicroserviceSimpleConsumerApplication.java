package com.jamin.microservicesimpleconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/5/2 9:54
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimpleConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleConsumerApplication.class, args);
    }
}
