package com.jamin.microservicesimpleconsumer.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 指定某个服务使用特定的负载均衡规则
 *
 * @author 杰明Jamin
 * @date 2018/5/3 17:47
 */
@Configuration
@RibbonClient(name = "microservice-simple-provider", configuration = RobbinConfig.class)
public class RobbinNewConfig {
}
