package com.danielgomes.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {



        userRepository.deleteAll();

        User maria = new User(null, "Daniel Gomes", "daniel@gmail.com");
        User jao = new User(null, "maria", "maria@maria.com");
        User teste = new User(null, "lala", "marlia@maria.com");


        userRepository.saveAll(Arrays.asList(maria, jao,teste));



    }
}
