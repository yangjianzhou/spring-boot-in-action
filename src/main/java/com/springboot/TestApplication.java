package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangjianzhou on 17-5-15.
 */

@RestController
@SpringBootApplication
public class TestApplication {

    @Autowired
    private HelloService helloService ;

    @RequestMapping("/")
    public String index(){
        return helloService.sayHello();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class ,args);
    }
}
