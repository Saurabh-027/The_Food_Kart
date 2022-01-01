package com.example.thefoodcart.config;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contrroller {
    @GetMapping("/welcome")
    public String showwel()
    {
        return "welcome";
    }
}
