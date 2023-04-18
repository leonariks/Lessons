package com.example.users.controllers;

import com.example.users.models.User;
import com.example.users.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    @Value("${upload.path}")
    private String uploadPath;
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    // Данный метод позволяет отобразить страницу добавления пользователей
    @GetMapping("/add")
    public String userAdd(Model model) {
        model.addAttribute("user", new User());
        return "userAdd";
    }

    // Данный метод позволяет принять объект с формы редактирования и сохранить нового пользователя
    @PostMapping("/add")
    public String userAdd(@ModelAttribute("user") @Valid User newUser, BindingResult bindingResult, @RequestParam("file") MultipartFile file) throws IOException {
        if (bindingResult.hasErrors()) {
            return "userAdd";
        }
        if (file != null){
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()){
                uploadDir.mkdirs();
            }
            String uuid = UUID.randomUUID().toString();
            String resultFileName = uuid + "." + file.getOriginalFilename();
            file.transferTo(new File(uploadPath + "/" + resultFileName));
            newUser.setFileName(resultFileName);
        }

//        userDAO.addUser(newUser);
            userService.userAdd(newUser);
        return "redirect:/user";
    }

    // Данный метод позволяет отобразить главную страницу со списком всех пользователей
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("user", userService.getAllUser());
        return "user";
    }

    // Данный метод позволяет найти пользователя по id и вернуть шаблон с подробной информацией о конкретном пользователе
    @GetMapping("/{id}")
    public String userInfo(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userService.getUserId(id));
        return "userInfo";

    }

    // Данный метод позволяет получить объект редактируемого пользователя по id и вернуть шаблон редактирования
    @GetMapping("/edit/{id}")
    public String userEdit(Model model, @PathVariable("id") int id) {
        model.addAttribute("userEdit", userService.getUserId(id));
        return "userEdit";
    }

    // Данный метод позволяет принять данные с формы редактирования пользователя и обновить данные редактируемого пользователя
    @PostMapping("/edit/{id}")
    public String userEditValue(@ModelAttribute("userEdit") @Valid User user, BindingResult bindingResult, @PathVariable("id") int id) {
        if (bindingResult.hasErrors()) {
            return "userEdit";
        }
        userService.userEdit(id, user);
        return "redirect:/user/" + id;
    }

    @GetMapping("/delete/{id}")
    // Данный метод позволяет удалить пользователя по id
    public String userDelete(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/user";
    }

    @GetMapping("/sortingAndSearching")
    public String sortingAndSearching() {
        return "sortingAndSearching";
    }


    @PostMapping("/sortingAndSearching")
    public String sortingAndSearching(@RequestParam("sortingOrFilteringOption") String sortingOrFilteringOption, @RequestParam("optionSort") String optionSort, Model model) {
        if (sortingOrFilteringOption.equals("email")) {
            model.addAttribute("users", userService.getUserEmail(optionSort));
        } else if (sortingOrFilteringOption.equals("phoneNumber")) {
            model.addAttribute("users", userService.getUserPhoneNumber(optionSort));
        } else if (sortingOrFilteringOption.equals("lastName")) {
            model.addAttribute("users", userService.getUserLastNameOrderByAge(optionSort));
        } else if (sortingOrFilteringOption.equals("lastNameDesc")) {
            model.addAttribute("users", userService.getUserLastNameStartingWith(optionSort));
        } else if (sortingOrFilteringOption.equals("lastNameStart")) {
            model.addAttribute("users", userService.getUserLastNameStartingWith(optionSort));
        }
        return "sortingAndSearching";
    }

}
