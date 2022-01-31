package com.example.thefoodcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/welcome"})
    public ModelAndView welcomePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome/welcome");
        return modelAndView;
    }
}
