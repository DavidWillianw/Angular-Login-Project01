package com.example.login.repositories;
import com.example.login.domain.user.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String>{

    Optional<User> findByEmail(String email);

    
}
