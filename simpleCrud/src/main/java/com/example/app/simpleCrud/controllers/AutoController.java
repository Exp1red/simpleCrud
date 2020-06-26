package com.example.app.simpleCrud.controllers;

import com.example.app.simpleCrud.entity.Auto;
import com.example.app.simpleCrud.entity.Person;
import com.example.app.simpleCrud.service.AutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auto")
public class AutoController {

    private final AutoService autoService;

    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @GetMapping
    public String showAllAuto(Model model) {
        model.addAttribute("auto", autoService.findAll());
        return "auto/all-auto";
    }


    @PostMapping("/create")
    public String createAuto(Auto auto) {
        autoService.saveAuto(auto);
        return "redirect:/auto";
    }


    @GetMapping("/create")
    public String createAutoForm(Auto auto ) {
        return "auto/create-auto";
    }



    @GetMapping("/update/{id}")
    public String updateAutoForm(@PathVariable("id") int id, Auto auto) {
        return "auto/update-auto";
    }

    @PostMapping("/update")
    public String updateAuto(Auto auto) {
        autoService.saveAuto(auto);
        return "redirect:/auto";
    }


    @GetMapping("/delete/{id}")
    public String deleteAuto(@PathVariable("id") int id) {
        autoService.deleteAuto(id);
        return "redirect:/auto";
    }

}
