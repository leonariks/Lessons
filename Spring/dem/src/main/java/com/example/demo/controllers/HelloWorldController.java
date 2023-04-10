package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {
    @Value("${hello_world}")
    private String HelloWorld;
}
