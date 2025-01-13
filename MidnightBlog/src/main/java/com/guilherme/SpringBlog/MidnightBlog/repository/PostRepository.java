package com.guilherme.SpringBlog.MidnightBlog.repository;

import com.guilherme.SpringBlog.MidnightBlog.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post, String> {
}
