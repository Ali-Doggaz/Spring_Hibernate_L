package com.example.demo;

import com.example.demo.user.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements org.springframework.boot.CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args){
        User user = new User("Ali","Admin");
        userDAOService.insert(user);
        log.info("User id " + user.getId() + " added.");
    }
}
