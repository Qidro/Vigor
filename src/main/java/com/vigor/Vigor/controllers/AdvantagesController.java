package com.vigor.Vigor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdvantagesController {

    //переадресация на страницу "Приемущество"
    @GetMapping("/Advantages")
    public String Advantages( Model model) {
        model.addAttribute("title", "Наши приемущества");
        return "Advantages";
    }
}
