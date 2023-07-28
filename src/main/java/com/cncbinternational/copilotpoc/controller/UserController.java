package com.cncbinternational.copilotpoc.controller;
import com.cncbinternational.copilotpoc.Entity.User;
import com.cncbinternational.copilotpoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired(required = false)
    private UserRepository userRepository;

    //**
    // * Retrieve all users
    // * @return
    // */
    // Retrieve all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}

