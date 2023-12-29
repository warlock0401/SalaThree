package com.tubes.salathree.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class LandingPageController {
    @GetMapping(value = "/")
    public String home() {

        return "redirect:/login";
    }
}
