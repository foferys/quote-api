package com.prova_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        
        String frase = "Frasi simpatiche sulla programmazione";
        model.addAttribute("frase", frase);

        return "index";
    }
    
    
}
