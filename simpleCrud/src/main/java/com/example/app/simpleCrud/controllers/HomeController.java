package com.example.app.simpleCrud.controllers;


import com.example.app.simpleCrud.entity.Person;
import com.example.app.simpleCrud.service.AutoService;
import com.example.app.simpleCrud.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final PersonService personService;
    private final AutoService autoService;

    public HomeController(PersonService personService, AutoService autoService) {
        this.personService = personService;
        this.autoService = autoService;

    }

    @GetMapping
    public String mainTable(Model persons) {

        List<Person> listOfPerson = personService.findAll();

        persons.addAttribute("persons" , listOfPerson);
        return "home";
    }

    @GetMapping("/editor")
    public String editor(){
        return "editor";
    }



}
