package com.danielgomes.demo.services;

import com.danielgomes.demo.dto.UserDTO;
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

    public User findById(String id) {
        User user = repo.findOne(id);
        if(user == null) {
            throw  new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repo.delete(id);

    }


    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
