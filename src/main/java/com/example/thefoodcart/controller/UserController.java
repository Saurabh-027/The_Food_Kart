package com.example.thefoodcart.controller;

//import com.example.thefoodcart.model.User;
import com.example.thefoodcart.entity.User;
import com.example.thefoodcart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST, produces = "text/html")
    public ModelAndView createUser(User user) {
        System.out.println("User name is - " + user.getName());

        userService.registerUser(user);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login/login");
        return modelAndView;
    }

    @GetMapping("/registration.html")
    public ModelAndView registrationPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("/registration/registration");
        return modelAndView;
    }

    @GetMapping("/login.html")
    public ModelAndView loginPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
      //  modelAndView.addObject("cred", new ObjectError("cred", ""));
//        bindingResult.addError(new ObjectError("cred", ""));
        modelAndView.setViewName("/login/login");
        return modelAndView;
    }

    @GetMapping("/food.html")
    public ModelAndView foodpage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/food/food");
        return modelAndView;
    }

    @GetMapping("/restaurant.html")
    public ModelAndView restaurantpage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/foodRestaurants/restaurant");
        return modelAndView;
    }
    @GetMapping("/TableBooking.html")
    public ModelAndView TableBookingpage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/foodRestaurants/restaurant");
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(User user, BindingResult bindingResult){
        System.out.println("-------------- Login User name : " + user.getEmail() + "------------------");

       ModelAndView modelAndView = new ModelAndView();

         if(userService.checkLogin(user)) {
            modelAndView.setViewName("/home/home");
        } else {
            String error = "Invalid Credentials";
            ObjectError objectError = new ObjectError("cred", error);
            bindingResult.addError(objectError);

        }
//modelAndView.setViewName("/login/login");

        return modelAndView;
    }
}
