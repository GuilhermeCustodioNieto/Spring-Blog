package com.guilherme.SpringBlog.MidnightBlog.services;

import com.guilherme.SpringBlog.MidnightBlog.domain.User;
import com.guilherme.SpringBlog.MidnightBlog.dto.UserDTO;
import com.guilherme.SpringBlog.MidnightBlog.repository.UserRepository;
import com.guilherme.SpringBlog.MidnightBlog.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return userRepository.insert(obj);
    }

    public User fromDTO(UserDTO userDTO){
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
