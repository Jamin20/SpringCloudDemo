package com.jamin.microservicesimpleprovider.service.impl;

import com.jamin.entity.TestBean;
import com.jamin.entity.TestEnum;
import com.jamin.microservicesimpleprovider.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/5/2 10:01
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public TestBean getTestBean(Long id) {
        TestBean bean = new TestBean();
        bean.setId(id);
        bean.setName("测试");
        bean.setStartDate(new Date());
        bean.setTestEnum(TestEnum.Sunday);
        return bean;
    }
}
