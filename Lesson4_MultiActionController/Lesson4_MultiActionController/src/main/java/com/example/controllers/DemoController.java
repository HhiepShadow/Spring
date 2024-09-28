package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World";
    }

    @ResponseBody
    @RequestMapping("/bye")
    public String bye() {
        return "Bye, World";
    }
}
