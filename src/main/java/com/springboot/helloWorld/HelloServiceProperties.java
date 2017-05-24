package com.springboot.helloWorld;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yangjianzhou on 17-5-15.
 */

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
