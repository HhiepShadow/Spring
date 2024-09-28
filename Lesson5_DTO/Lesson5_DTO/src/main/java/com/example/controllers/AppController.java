package com.example.controllers;

import com.example.dto.NumberInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
    @RequestMapping("/home")
    public String homePage(){
        return "home-page";
    }

    @RequestMapping(value = "/process-homepage", method = {RequestMethod.GET, RequestMethod.POST})
    public String getResultPage(@ModelAttribute("numberInfo") NumberInfoDTO numberInfoDTO, Model model) {
        System.out.println(numberInfoDTO);
        model.addAttribute("numberInfo", numberInfoDTO.getNumber1());
        return "result-page";
    }
}
