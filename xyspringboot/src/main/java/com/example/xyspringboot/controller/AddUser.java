package com.example.xyspringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AddUser")
public class AddUser {

    public String userName(){
        return "test--userName";
    }
}
