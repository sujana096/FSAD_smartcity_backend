package com.example.smartcity.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.smartcity.backend.model.User;
import com.example.smartcity.backend.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User signup(User user) {
        return repo.save(user);
    }

    public User login(User user) {
        User u = repo.findByUsername(user.getUsername());
        if (u != null && u.getPassword().equals(user.getPassword())) {
            return u;
        }
        return null;
    }
}