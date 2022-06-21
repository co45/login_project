package com.example.login_project.controllers;

import com.example.login_project.models.User;
import com.example.login_project.repository.UserRepository;
import com.example.login_project.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private LoginService login_s;

    @PostMapping("/login")
    public ResponseEntity<?> userAuthentication(@Valid @RequestBody User user) {

        if (login_s.signIn(user)) {
            user.setId(Long.valueOf(login_s.idByUser(user.getLogin())));
            return  ResponseEntity.ok().body(user);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logoutUser() {
        return ResponseEntity.ok().body("Deconnecté !");
    }
}

