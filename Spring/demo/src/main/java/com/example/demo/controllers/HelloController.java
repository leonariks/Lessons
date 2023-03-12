package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("spring/")
public class HelloController {

    @GetMapping("/Hello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/message")
    public String getMessage(){
        return "message";
    }
}


