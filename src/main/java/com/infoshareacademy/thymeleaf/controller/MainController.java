package com.infoshareacademy.thymeleaf.controller;

import com.infoshareacademy.thymeleaf.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.infoshareacademy.thymeleaf.model.Constants.*;

@Controller
public class MainController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/")
    String index(Model model) {
        model.addAttribute("dateTime",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME)))
             .addAttribute("content", "index");
        return "main";
    }

    @GetMapping("/info")
    String info(Model model) {
        model.addAttribute("name", INFO_NAME)
             .addAttribute("role", INFO_ROLE)
             .addAttribute("slack", INFO_SLACK)
             .addAttribute("content", "info");
        return "main";
    }

    @GetMapping("/players")
    String players(Model model) {
        model.addAttribute("players", playerService.getPlayers())
             .addAttribute("content", "players");
        return "main";
    }

}
