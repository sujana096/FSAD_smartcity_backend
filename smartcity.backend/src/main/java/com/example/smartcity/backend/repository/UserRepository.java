package com.example.smartcity.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.smartcity.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}