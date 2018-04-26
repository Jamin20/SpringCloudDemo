package com.jamin.microserviceconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/4/26 18:01
 */
@RestController
public class ConfigClientController {

    @Value("${test}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile() {
        return this.profile;
    }

}
