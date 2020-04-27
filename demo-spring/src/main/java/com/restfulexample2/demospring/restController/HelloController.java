package com.restfulexample2.demospring.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello-world")

    public String Hello()
    {
        return "Hello world";
    }

//@GetMapping("/hello-bean")
//    public HelloControllerBean helloControllerBean(){
//        return new HelloControllerBean("hello bean");
//    }
//
//    //path-variable
//    @GetMapping(path="/hello/path-variable/{name}")
//    public HelloControllerBean helloControllerBean(@PathVariable String name) {
//        return new HelloControllerBean(String.format("hello %s",name));
//    }
    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized(){
        return  messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
    }



}
