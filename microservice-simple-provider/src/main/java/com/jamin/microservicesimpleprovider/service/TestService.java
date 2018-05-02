package com.jamin.microservicesimpleprovider.service;


import com.jamin.entity.TestBean;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/5/2 10:01
 */
public interface TestService {

    /**
     * 测试获得bean
     * @param id 输入id
     * @return 返回TestBean
     */
    TestBean getTestBean(Long id);
}
