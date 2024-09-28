package com.example.controllers;

import com.example.dto.NameInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping("/home")
    public String homePage() {
        return "home-page";
    }

    @RequestMapping("/process-homepage")
    public String showResultPage(NameInfoDTO nameInfoDTO, Model model) {
        model.addAttribute("nameInfo", nameInfoDTO);

        return "process";
    }
}
