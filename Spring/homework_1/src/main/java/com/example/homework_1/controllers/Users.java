package com.example.homework_1.controllers;

import com.example.homework_1.dao.DaoUsers;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class Users {
    private final DaoUsers daoUsers;

    public Users(DaoUsers daoUsers) {
        this.daoUsers = daoUsers;
    }

    @GetMapping("/users")
    public String index(Model model){
        model.addAttribute("users", daoUsers.getUsers());
        return "users";
    }

    @GetMapping("/users/{id}")
    public String infoUsers( @PathVariable ("id") int id, Model model){
        model.addAttribute("users", daoUsers.getUsersId(id));
        return "users_info";
    }


    @GetMapping("/users/add")
    public String newUsers(Model model){
        model.addAttribute("users", new com.example.homework_1.models.Users());
        return "add_users";
    }

    @PostMapping("/users/add")
    public String newUsers(@ModelAttribute("users") @Valid com.example.homework_1.models.Users users, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "add_users";
        }
        daoUsers.addUsers(users);
        return "redirect:/users";
    }

    @GetMapping("/users/edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model){
        model.addAttribute("edit_users", daoUsers.getUsersId(id));
        return "edit_users";
    }

    @PostMapping("/users/edit/{id}")
    public String edit_User(@ModelAttribute("edit_users") @Valid com.example.homework_1.models.Users users, BindingResult bindingResult, @PathVariable("id") int id){
        if (bindingResult.hasErrors()){
            return "edit_users";
        }
        daoUsers.updatePerson(id, users);
        return "redirect:/users";
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        daoUsers.deleteUsers(id);
        return "redirect:/users";
    }

}
