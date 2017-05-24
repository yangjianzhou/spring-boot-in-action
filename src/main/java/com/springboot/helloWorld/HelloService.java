package com.springboot.helloWorld;

/**
 * Created by yangjianzhou on 17-5-15.
 */
public class HelloService {

    private String msg;

    public String sayHello() {
        return "Hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
