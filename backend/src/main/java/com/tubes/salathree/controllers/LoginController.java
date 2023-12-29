package com.tubes.salathree.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class LoginController {
    @GetMapping(value = "/login")
    public String home() {

        return "loginPage";
    }

    @PostMapping(value = "/login")
    public String loginPost(@RequestParam("email") String emailRequest,
            @RequestParam("password") String passwordRequest) {
        ModelAndView modelAndView = new ModelAndView();
        String email = emailRequest;
        String pass = passwordRequest;
        System.out.println(email + pass);
        return "";
    }
}
