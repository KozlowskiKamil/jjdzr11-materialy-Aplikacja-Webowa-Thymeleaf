package com.infoshareacademy.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.infoshareacademy.thymeleaf.model.Constants.*;

@Controller
public class MainController {

    @GetMapping("/")
    String index(Model model) {
        model.addAttribute("dateTime",
            LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        );
        return "index";
    }

    @GetMapping("/info")
    String info(Model model) {
        model.addAttribute("name", INFO_NAME)
             .addAttribute("role", INFO_ROLE)
             .addAttribute("slack", INFO_SLACK);
        return "info";
    }

}
