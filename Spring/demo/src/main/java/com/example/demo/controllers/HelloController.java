package com.example.demo.controllers;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("spring/")
public class HelloController {


//    @GetMapping("/hello")
//    public String getHelloUser(@RequestParam(value = "last_name", required = false) String last_name, @RequestParam(value = "first_name", required = false) String first_name, @RequestParam(value = "patronymic", required = false) String patronymic, Model model){
//        String first_name = request.getParameter("first_name"); // Получение имени из get параметра
//        String last_name = request.getParameter("last_name"); // Получение фамилия из get параметра
//        String patronymic = request.getParameter("patronymic"); // Получение отчества из get параметра
//
//        System.out.println("Вас приветствует система по выводу ФИО пользователей");
//        System.out.println("Ваша фамилия: " + last_name);
//        System.out.println("Ваше имя: " + first_name);
//        System.out.println("Ваше отчество: " + patronymic);
//        model.addAttribute("first_name", first_name);
//        model.addAttribute("last_name", last_name);
//        model.addAttribute("patronymic", patronymic);
//        return "hello";
//    }

        @GetMapping("/hello")
    public String getHelloUser(@RequestParam(value = "last_name", required = false) String last_name, @RequestParam(value = "first_name", required = false) String first_name, @RequestParam(value = "patronymic", required = false) String patronymic, Model model){
//        String first_name = request.getParameter("first_name"); // Получение имени из get параметра
//        String last_name = request.getParameter("last_name"); // Получение фамилия из get параметра
//        String patronymic = request.getParameter("patronymic"); // Получение отчества из get параметра
//
//        System.out.println("Вас приветствует система по выводу ФИО пользователей");
//        System.out.println("Ваша фамилия: " + last_name);
//        System.out.println("Ваше имя: " + first_name);
//        System.out.println("Ваше отчество: " + patronymic);

            model.addAttribute("first_name", first_name);
            model.addAttribute("last_name", last_name);
            model.addAttribute("patronymic", patronymic);

        return "hello";
    }


    @GetMapping("/message")
    public String getMessage(){
        return "message";
    }


}
