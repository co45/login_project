package com.example.login_project.controllers;

import com.example.login_project.models.User;
import com.example.login_project.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class loginController {

    @Autowired
    private userRepo ur;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody User user) {
        boolean test;
        String pwd = "";
        User u = new User();
        test = ur.existsByLogin(user.getLogin());
        pwd = ur.passByLogin(user.getLogin());

         if(test && pwd==user.getPassword()){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}

