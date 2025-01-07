package com.guilherme.SpringBlog.MidnightBlog.repository;

import com.guilherme.SpringBlog.MidnightBlog.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
