package com.springmvcformapp.spring_mcv_form_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String home() {
        return "home"; // This will resolve to src/main/resources/templates/home.html
    }   
    
}

