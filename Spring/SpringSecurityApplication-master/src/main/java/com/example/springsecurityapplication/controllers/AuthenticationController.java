package com.example.springsecurityapplication.controllers;

import com.example.springsecurityapplication.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthenticationController {
    @GetMapping("authentication")
    public String login(){
        return "authentication";
    }
//    @GetMapping("/registration")
//    public String registration(Model model){
//        model.addAttribute("person",new Person());
//        return "registration";
////    }
//    @GetMapping("/registration")
//    public String registration(@ModelAttribute("person") Person person){
//        return "registration";
//    }
}
