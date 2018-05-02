package com.jamin.entity;

/**
 * Description:
 *
 * @author 杰明Jamin
 * @date 2018/5/2 10:10
 */
public enum TestEnum {

    /**
     * 周六
     */
    Saturday(6,"周六"),
    /**
     * 周日
     */
    Sunday(7,"周日");

    /**
     * 序号
     */
    private Integer index;

    /**
     * 描述
     */
    private String value;

    TestEnum(Integer index, String value) {
        this.index = index;
        this.value = value;
    }

    public Integer getIndex() {
        return index;
    }

    public String getValue() {
        return value;
    }
}
