package com.guilherme.SpringBlog.MidnightBlog.resources;

import com.guilherme.SpringBlog.MidnightBlog.domain.Post;
import com.guilherme.SpringBlog.MidnightBlog.domain.User;
import com.guilherme.SpringBlog.MidnightBlog.dto.UserDTO;
import com.guilherme.SpringBlog.MidnightBlog.resources.util.URL;
import com.guilherme.SpringBlog.MidnightBlog.services.PostService;
import com.guilherme.SpringBlog.MidnightBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Post>> findAll() {
        List<Post> posts = postService.findAll();
        return ResponseEntity.ok().body(posts);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);

        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/titlesearch", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text ) {
        text = URL.decodeParam(text);
        System.out.println(text);
        List<Post> posts = postService.findByTitle(text);

        return ResponseEntity.ok().body(posts);
    }
}
