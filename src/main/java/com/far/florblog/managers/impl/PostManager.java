package com.far.florblog.managers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.far.florblog.accessors.IPostAccessor;
import com.far.florblog.domains.Post;
import com.far.florblog.managers.IPostManager;

@Component
public class PostManager implements IPostManager{

    @Autowired
    IPostAccessor postAccessor;
    
    @Override
    public List<Post> getAllPosts() {
        return postAccessor.findAll();
    }

    @Override
    public Post getPostById(Long postId) {
        return postAccessor.findOne(postId);
    }

    @Override
    public List<Post> getPostsByAuthor(String author) {
        return postAccessor.findAllByAuthor(author);
    }

    @Override
    public Post createPost(Post post) {
        return postAccessor.save(post);
    }

    @Override
    public Post updatePost(Long postId, Post post) {
        Post currentPost = postAccessor.findOne(postId);
        if (currentPost == null || post.getPostId() != postId) {
          return null;
        }
        return postAccessor.save(post);
        
    }

    @Override
    public Post deletePost(Long postId) {
        Post post = postAccessor.findOne(postId);
        if (post == null) {
          return null;
        }
        postAccessor.delete(postId);
        return post;
    }

    
}

