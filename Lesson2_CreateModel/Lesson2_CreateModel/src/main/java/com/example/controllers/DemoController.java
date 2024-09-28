package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("/hello")

    // Method
    public String hello(Model model)
    {
        String myName = "Shadow";
        model.addAttribute("myName", myName);
        return "demo";
    }
}
