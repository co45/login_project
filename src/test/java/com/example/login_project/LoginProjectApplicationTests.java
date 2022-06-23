package com.example.login_project;

import com.example.login_project.models.User;
import com.example.login_project.repository.UserRepository;
import com.example.login_project.services.LoginService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LoginProjectApplicationTests {

	@Autowired
	private LoginService service;

	@MockBean
	private UserRepository rep;


	@Test
	public void getUserbyLoginTest() {

		Long id = Long.valueOf(1);
		assertEquals("test", service.idByUser("test"));
		assertEquals(id,service.idByUser("test"));
	}

}
