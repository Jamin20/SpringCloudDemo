package com.jamin.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/5/2 10:03
 */
public class TestBean {

    private Long id;

    private String name;

    private Date startDate;

    private TestEnum testEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public TestEnum getTestEnum() {
        return testEnum;
    }

    public void setTestEnum(TestEnum testEnum) {
        this.testEnum = testEnum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("startDate", startDate)
                .append("testEnum", testEnum)
                .toString();
    }
}
