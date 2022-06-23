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
        String pwd = user_r.getPasswordByLogin(user.getLogin());
        return pwd!=null && pwd.matches(user.getPassword()) ;
    }

    public int idByUser(String login){
        return user_r.idByLogin(login);
    }
}
