package com.example.login_project.services;

import com.example.login_project.models.User;
import com.example.login_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository user_r;

    public boolean signIn(User user) {

        boolean test;
        String pwd = "";

        test = user_r.existsByLogin(user.getLogin());
        pwd = user_r.passByLogin(user.getLogin());

        if (test && pwd.matches(user.getPassword())) {
            return true;
        } else {
            return false;
        }

    }

    public int idByUser(String login){
        return user_r.idByLogin(login);
    }
}
