package com.example.login_project.repository;

import com.example.login_project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByLogin(String login);

    @Query(value = "SELECT password FROM Users WHERE login =:log ;",nativeQuery = true)
    String passByLogin(@Param("log") String login);

    @Query(value = "SELECT id FROM Users WHERE login =:log ;",nativeQuery = true)
    int idByLogin(@Param("log") String login);

}
