package com.vigor.Vigor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminPanelController {
    //переадресация на страницу "Приемущество"
    @PostMapping("/admin/add_boat")
    public String HonePanel( Model model) {
        model.addAttribute("title", "Наши приемущества");
        return "Advantages";
    }
}
