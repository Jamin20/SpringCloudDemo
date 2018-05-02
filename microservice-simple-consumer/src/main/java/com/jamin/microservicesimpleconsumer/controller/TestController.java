package com.jamin.microservicesimpleconsumer.controller;

import com.jamin.entity.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/5/2 10:27
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${test.consumer.getTestBeanServicePath}")
    private String getTestBeanPath;

    @GetMapping("/test/{id}")
    public TestBean getTestBean(@PathVariable Long id) {
        return restTemplate.getForObject(getTestBeanPath + id, TestBean.class);
    }
}
