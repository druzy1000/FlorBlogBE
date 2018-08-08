package com.far.florblog.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.far.florblog.domains.Post;
import com.far.florblog.managers.IPostManager;

@RestController
@RequestMapping("/api/v1/post")
public class PostControllerV1 {

    @Autowired
    IPostManager postManager;
    
    @RequestMapping(method = RequestMethod.GET)
    List<Post> getAllPosts() {
        return postManager.getAllPosts();
    }

    @RequestMapping(value = "/{postId}", method = RequestMethod.GET)
    Post getPost(Long postId) {
        return postManager.getPostById(postId);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, 
            params={"startDate","endDate"})
    List<Post> getPostsByDate(@RequestParam("startDate") Long startDate, @RequestParam("endDate") Long endDate) {
        return Collections.emptyList();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Post createPost(@RequestBody Post post) {
        return postManager.createPost(post);
    }

    @RequestMapping(value = "/{postId}", method = RequestMethod.PUT)
    Post updatePost(@PathVariable Long postId, @RequestBody Post post) {
        return postManager.updatePost(postId, post);
    }

    @RequestMapping(value = "/{postId}", method = RequestMethod.DELETE)
    Post deletePost(@PathVariable Long postId) {
        return postManager.deletePost(postId);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET, 
            params={"author"})
   List<Post> getPostsByAuthor(@RequestParam("author") String author) {
       return postManager.getPostsByAuthor(author);
   }
}

