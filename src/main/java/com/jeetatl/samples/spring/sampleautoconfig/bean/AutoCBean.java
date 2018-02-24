package com.jeetatl.samples.spring.sampleautoconfig.bean;

public class AutoCBean {

    private Integer integer;
    private String string;

    public AutoCBean(Integer integer, String string) {
        this.integer = integer;
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "AutoCBean{" +
                "integer=" + integer +
                ", string='" + string + '\'' +
                '}';
    }
}
