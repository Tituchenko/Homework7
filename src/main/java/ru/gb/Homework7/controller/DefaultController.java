package ru.gb.Homework7.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gb.Homework7.services.AdminService;
import ru.gb.Homework7.services.DefaultService;
import ru.gb.Homework7.services.UserService;

@Controller
@AllArgsConstructor
public class DefaultController {
    AdminService adminService;
    DefaultService defaultService;
    UserService userService;
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("text", defaultService.getText());
        return "index";
    }
    @GetMapping("/public-data")
    public String userData (Model model) {
        model.addAttribute("text", userService.getText());
        return "index";
    }
    @GetMapping("/private-data")
    public String adminData (Model model) {
        model.addAttribute("text",adminService.getText());
        return "index";
    }
}
