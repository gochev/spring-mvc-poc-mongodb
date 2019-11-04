package com.novarto.spring.poc.springpoc.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(value = "user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/createuser", method = RequestMethod.GET)
    public ResponseEntity<User> createUser() {
        User user = userService.createUser();
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/listusers", method = RequestMethod.GET)
    public List<User> listUsers() {
        return userService.listUsers();
    }

}
