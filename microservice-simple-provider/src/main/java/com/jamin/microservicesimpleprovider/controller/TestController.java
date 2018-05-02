package com.jamin.microservicesimpleprovider.controller;

import com.jamin.entity.TestBean;
import com.jamin.microservicesimpleprovider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/5/2 10:49
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test/{id}")
    public TestBean getTestBean(@PathVariable Long id) {
        return testService.getTestBean(id);
    }
}
