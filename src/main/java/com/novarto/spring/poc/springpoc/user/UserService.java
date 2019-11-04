package com.novarto.spring.poc.springpoc.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(){
        User user = new User();
        user.setName("testing user");
        return userRepository.save(user);
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }
}
