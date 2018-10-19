package com.ajax.lv350.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String main() { return "redirect:/home"; }

    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @GetMapping("/registration")
    public String registration() { return "register"; }

    @GetMapping("/login")
    public String login() { return "login"; }
}
