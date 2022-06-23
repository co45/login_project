package com.example.login_project.services;

import com.example.login_project.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    @Test
    public void loginService(){
        User u = new User("test","test");
        assertEquals("test",u.getLogin(),"existant");
    }


}