package com.example.app.service;

import com.example.app.entity.User;
import com.example.app.repository.UserRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    UserRepository repository;

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public void createUser(User user) {
        repository.save(user);
    }
}
