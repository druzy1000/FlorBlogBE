package com.far.florblog.managers;

import java.util.List;

import com.far.florblog.domains.Post;

public interface IPostManager {
    
	List<Post> getAllPosts();
	Post getPostById(Long postId);
	List<Post> getPostsByAuthor(String author);
	Post createPost(Post post);
	Post updatePost(Long postId, Post post);
	Post deletePost(Long postId);

}

