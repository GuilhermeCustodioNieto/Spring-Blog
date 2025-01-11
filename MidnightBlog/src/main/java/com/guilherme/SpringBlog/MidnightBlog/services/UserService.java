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

    public void delete(String id){
        findById(id);
        userRepository.deleteById(id);
    }

    public User update(User obj){
        Optional<User> userOptional = userRepository.findById(obj.getId());
        updateData(userOptional.get(), obj);

        return userRepository.save(userOptional.get());
    }

    private void updateData(User user, User obj) {
        user.setName(obj.getName());
        user.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO userDTO){
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }






}
