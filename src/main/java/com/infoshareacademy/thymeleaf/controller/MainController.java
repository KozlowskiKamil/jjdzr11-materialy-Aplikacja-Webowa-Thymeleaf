package com.infoshareacademy.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    String index() {
        return "index";
    }

    @GetMapping("/info")
    String info() {
        return "info";
    }

}
