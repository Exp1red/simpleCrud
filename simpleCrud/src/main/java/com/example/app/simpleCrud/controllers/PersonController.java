package com.example.app.simpleCrud.controllers;


import com.example.app.simpleCrud.entity.Person;
import com.example.app.simpleCrud.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String findALl(Model model) {
        model.addAttribute("persons", personService.findAll());
        return "persons/all-persons";
    }

    @PostMapping("/create")
    public String createPerson(Person person) {
        personService.savePerson(person);
        return "redirect:/persons";
    }

    @GetMapping("/create")
    public String createPersonForm(Person person) {
        return "persons/create-persons";
    }


    @GetMapping("/update/{id}")
    public String updatePersonForm(@PathVariable("id") int id, Person person) {
        return "persons/update-persons";
    }

    @PostMapping("/update")
    public String updatePerson(Person person) {
        personService.savePerson(person);
        return "redirect:/persons";
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable("id") int id) {
        personService.deletePerson(id);
        return "redirect:/persons";
    }
}
