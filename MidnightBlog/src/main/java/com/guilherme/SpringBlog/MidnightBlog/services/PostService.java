package com.guilherme.SpringBlog.MidnightBlog.services;

import com.guilherme.SpringBlog.MidnightBlog.domain.Post;
import com.guilherme.SpringBlog.MidnightBlog.domain.User;
import com.guilherme.SpringBlog.MidnightBlog.dto.UserDTO;
import com.guilherme.SpringBlog.MidnightBlog.repository.PostRepository;
import com.guilherme.SpringBlog.MidnightBlog.repository.UserRepository;
import com.guilherme.SpringBlog.MidnightBlog.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll(){
        return postRepository.findAll();
    }

    public Post findById(String id){
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


}
