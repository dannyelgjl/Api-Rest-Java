package com.danielgomes.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public List<User> findAll() {
        User daniel = new User("1", "Daniel", "daniel@gmail.com");
        User bianca = new User("2", "bianca", "bianca@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(daniel, bianca));
        return list;
    }
}
