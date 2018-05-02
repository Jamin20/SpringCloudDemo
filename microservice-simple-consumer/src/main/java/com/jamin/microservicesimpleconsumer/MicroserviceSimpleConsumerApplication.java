package com.jamin.microservicesimpleconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/5/2 9:54
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroserviceSimpleConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleConsumerApplication.class, args);
    }
}
