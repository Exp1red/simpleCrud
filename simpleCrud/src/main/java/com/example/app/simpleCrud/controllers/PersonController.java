package com.example.app.simpleCrud.controllers;


import com.example.app.simpleCrud.entity.Person;
import com.example.app.simpleCrud.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public String findALl(Model model) {
        model.addAttribute("persons", personService.findAll());
        return "persons/all-persons";
    }

    @PostMapping("/persons/create")
    public String createPerson(Person person) {
        personService.savePerson(person);
        return "redirect:/persons";
    }

    @GetMapping("/persons/create")
    public String createPersonForm(Person person) {
        return "persons/create-persons";
    }



    @GetMapping("/persons/update/{id}")
    public String updatePersonForm(@PathVariable("id") int id, Person person) {
        return "persons/update-persons";
    }

    @PostMapping("/persons/update")
    public String updatePerson(Person person) {
        personService.savePerson(person);
        return "redirect:/persons";
    }

    @GetMapping("/persons/delete/{id}")
    public String deletePerson(@PathVariable("id") int id) {
        personService.deletePerson(id);
        return "redirect:/persons";
    }
}
