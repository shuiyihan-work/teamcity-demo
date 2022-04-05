package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TeamcityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamcityDemoApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world !!!";
    }

    @RequestMapping("/test")
    public String test(){
        return "Test !!!";
    }
}
