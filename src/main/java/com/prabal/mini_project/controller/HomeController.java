package com.prabal.mini_project.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class HomeController {

    @GetMapping
    public String home() {
        return "Home Page";
    }

}
