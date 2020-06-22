package com.example.app.simpleCrud.controllers;

import com.example.app.simpleCrud.entity.Auto;
import com.example.app.simpleCrud.service.AutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AutoController {

    private final AutoService autoService;

    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @GetMapping("/auto")
    public String showAllAuto(Model model) {
        model.addAttribute("auto", autoService.findAll());
        return "auto/all-auto";
    }

    @PostMapping("/auto/create")
    public String createAuto(Auto auto) {
        autoService.saveAuto(auto);
        return "redirect:/auto";
    }

    @GetMapping("/auto/create")
    public String createAutoForm(Auto auto) {
        return "auto/create-auto";
    }



    @GetMapping("/auto/update/{id}")
    public String updateAutoForm(@PathVariable("id") int id, Auto auto) {
        return "auto/update-auto";
    }

    @PostMapping("/auto/update")
    public String updateAuto(Auto auto) {
        autoService.saveAuto(auto);
        return "redirect:/auto";
    }


    @GetMapping("/auto/delete/{id}")
    public String deleteAuto(@PathVariable("id") int id) {
        autoService.deleteAuto(id);
        return "redirect:/auto";
    }

}
