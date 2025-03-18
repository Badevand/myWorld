package com.example.mypresentationwebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Om mig");
        return "about";
    }

    @GetMapping("/family")
    public String family(Model model) {
        model.addAttribute("title", "Min familie");
        return "family";
    }

    @GetMapping("/pets")
    public String pets(Model model) {
        model.addAttribute("title", "Mine kæledyr");
        return "pets";
    }

    @GetMapping("/hobbies")
    public String hobbies(Model model) {
        model.addAttribute("title", "Min sport og fritid");
        return "hobbies";
    }
}
