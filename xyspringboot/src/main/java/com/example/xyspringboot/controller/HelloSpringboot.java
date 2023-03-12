package com.example.xyspringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloSpringboot {

    public String helloController(){
        System.out.println("打印在控制台-----springboot");
        System.out.println("打印在控制台-----springboot1");
        return "springboot 返回给前端";
    }
}
