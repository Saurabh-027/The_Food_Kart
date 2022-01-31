package com.example.thefoodcart.service;

import com.example.thefoodcart.entity.User;
import com.example.thefoodcart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public boolean checkLogin(User user) {
        User foundUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if(foundUser != null){
            return true;
        } else {
            return false;
        }
    }
}
