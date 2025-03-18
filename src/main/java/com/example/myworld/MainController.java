package com.example.myworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
{

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/om_mig")
    public String about(Model model)
    {
        model.addAttribute("title", "Om mig");
        return "about";
    }

    @GetMapping("/min_familie")
    public String family(Model model)
    {
        model.addAttribute("title", "Min familie");
        return "family";
    }

    @GetMapping("/mine_kæledyr")
    public String pets(Model model)
    {
        model.addAttribute("title", "Mine kæledyr");
        return "pets";
    }

    @GetMapping("/mine_hobbyer")
    public String hobbies(Model model)
    {
        model.addAttribute("title", "Mine hobbyer");
        return "hobbies";
    }

    // test
    @GetMapping("/test")
    public String test() {
        return "test";  // Returnerer test.html
    }

}
