package com.prabal.mini_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerErr {
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String redirectToHome() {
//        return "redirect:home";
//    }
    @RequestMapping("/error")
    public String handleError() {
        //do something like logging
        return "redirect:/home";
    }
}
