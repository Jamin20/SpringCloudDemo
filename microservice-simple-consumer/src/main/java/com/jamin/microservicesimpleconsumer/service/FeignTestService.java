package com.jamin.microservicesimpleconsumer.service;

import com.jamin.entity.TestBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 * FeignClient注解中的value值是访问目标微服务的微服务名
 * @author 杰明Jamin
 * @date 2018/5/2 17:52
 */
@FeignClient(value = "microservice-simple-provider", path = "/")
@ResponseBody
public interface FeignTestService {

    /**
     * 调用其他服务
     * @param id
     * @return
     */
    @GetMapping(value = "/test/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    TestBean getTestBeanById(@PathVariable(value = "id") Long id);
}
