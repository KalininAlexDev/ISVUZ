package ru.statistic.jira.contrrollers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ComponentScan
public class mainController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title","Главная страница");
        return "index";
    }
}
