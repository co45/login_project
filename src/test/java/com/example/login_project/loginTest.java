package com.example.login_project;

import com.example.login_project.models.User;
import com.example.login_project.repository.UserRepository;
import com.example.login_project.services.LoginService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class loginTest {


    @Autowired
    private LoginService loginService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setMockOutput() {
        when(userRepository.idByLogin("test")).thenReturn(1);
    }
    @Test
    void testGet() {
        assertEquals(1, loginService.idByUser("test"));
    }
}
