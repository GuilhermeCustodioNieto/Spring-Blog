package com.guilherme.SpringBlog.MidnightBlog.resources;

import com.guilherme.SpringBlog.MidnightBlog.domain.User;
import com.guilherme.SpringBlog.MidnightBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity findAll() {
        List<User> users = userService.findAll();

        return ResponseEntity.ok().body(users);
    }

}
