package com.example.p2.service.impl;

import com.example.p2.domain.User;
import com.example.p2.repositories.UserRepository;
import com.example.p2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    UserRepository repository;

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

}
