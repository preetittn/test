package com.restfulexample2.demospring.restController;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloControllerBean {

    String msg;

    public HelloControllerBean(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "helloControllerBean{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

