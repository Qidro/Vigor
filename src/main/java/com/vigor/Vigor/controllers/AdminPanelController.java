package com.vigor.Vigor.controllers;

import com.vigor.Vigor.model.Advantages;
import com.vigor.Vigor.repo.AdvantagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminPanelController {
    @Autowired
    private AdvantagesRepository AdvantagesRepository;

    //переадресация на страницу "Приемущество"
    @PostMapping("/admin/add_boat")
    public String HonePanel( Model model) {
        model.addAttribute("title", "Наши приемущества");
        return "Advantages";
    }

    @PostMapping("/admin/add_advantages")
    public String AddAdvantages( Model model) {
        model.addAttribute("title", "Редактирование Наши приемущества");
        return "Add-Advantages";
    }


    @PostMapping("/Advantages/add")
    public String AddAdvantagesAdd(@RequestParam String title, @RequestParam String full_text, Model model) {
        Advantages post = new Advantages(title, full_text);
        AdvantagesRepository.save(post);
        return "redirect:/admin";
    }
}
