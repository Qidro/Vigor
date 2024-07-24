package com.vigor.Vigor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    //переадресация на главную страницу
    @GetMapping("/")
    public String Vigor( Model model) {
        model.addAttribute("title", "Vigor - катера");
        return "Vigor-get";
    }

    //переадресация на страницу "Приемущество"
    @GetMapping("/Advantages")
    public String Advantages( Model model) {
        model.addAttribute("title", "Vigor - катера");
        return "Advantages";
    }

    //переадресация на админ панель сайта
    @GetMapping("/admin")
    public String Admin_panel( Model model) {
        model.addAttribute("title", "Админ панель сайта");
        return "Admin";
    }

}