package com.revature.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.revature.models.User;
import com.revature.services.ProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    ProfileService profileService;


    @GetMapping("/get/{id}")
    public Optional<User> getProfileById(@PathVariable int id){
        return profileService.getProfileById(id);
    }

    @PutMapping("/update")
    public User editProfile(@RequestBody User user) {
        return profileService.editProfile(user);
    }
}
