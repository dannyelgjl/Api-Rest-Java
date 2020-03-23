package com.danielgomes.demo.repository;

import com.danielgomes.demo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReporitory extends MongoRepository<User, String> {

}
