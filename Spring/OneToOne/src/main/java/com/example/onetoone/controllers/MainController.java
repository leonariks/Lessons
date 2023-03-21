package com.example.onetoone.controllers;

import com.example.onetoone.models.Passport;
import com.example.onetoone.models.Person;
import com.example.onetoone.repositories.PassportRepository;
import com.example.onetoone.repositories.PersonRepository;
import com.example.onetoone.services.PassportService;
import com.example.onetoone.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final PassportService passportService;
    private final PersonService personService;

    private final PassportRepository passportRepository;

    @Autowired
    public MainController(PassportService passportService, PersonService personService, PassportRepository passportRepository) {
        this.passportService = passportService;
        this.personService = personService;
        this.passportRepository = passportRepository;
    }

    //Получаем список всех пользователей
    @GetMapping("/person")
    public String getAllPerson(Model model){
        model.addAttribute("persons",personService.getAllPerson());
        return "person";
    }

    @GetMapping("/passport")
    public String getAllPassport(Model model){
        model.addAttribute("passport",passportService.getAllPassport());
        return "passport";
    }

    //Возвращаем представление с добавлением пользователей и передаем списки всех паспортов
    @GetMapping("/person/new")
    public String personAdd(Model model){
        model.addAttribute("person", new Person());
        model.addAttribute("passport", passportService.getAllPassport());
        return "personAdd";
    }

    @PostMapping("/person/new")
    public String personAdd(@ModelAttribute("person") Person person, @RequestParam String number){
        Passport passport = passportRepository.findByNumber(number);
        Person newPerson = new Person(person.getLastName(), person.getFirstName(), person.getPatronymic(), passport);
        personService.personAdd(newPerson);
        return "redirect:/person";
    }
}
