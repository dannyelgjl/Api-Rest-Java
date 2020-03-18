package com.danielgomes.demo.services;

import com.danielgomes.demo.exception.ObjectNotFoundException;
import com.danielgomes.demo.domain.User;
import com.danielgomes.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }


    // Corrigir
    public User findById(String id) {
        User user = repo.findOne(id);
        if(user == null) {
            throw  new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }
}
