package com.far.florblog.domains;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
   
   @Id
   @Column(name = "post_id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long postId;
   
   @Column(name = "title")
   private String title;
   
   @Column(name = "body")
   private String body;
   
   @Column(name = "author")
   private String author;
   
   @Column(name = "created_on")
   private LocalDateTime createdOn;
   
   @Column(name = "last_updated")
   private LocalDateTime lastUpdated;
   
       public Long getPostId() {
           return postId;
       }

       public void setPostId(Long postId) {
           this.postId = postId;
       }
       
       public String getPostTitle(){
           return title;
       }
       
       public void setPostTitle(String title){
           this.title = title; 
       }
       
       public String getPostBody(){
           return body;
       }
       
       public void setPostBody(String body){
           this.body = body; 
       }
       
       public String getPostAuthor(){
           return author;
       }
       
       public void setPostAuthor(String author){
           this.author = author; 
       }
       
       public LocalDateTime getPostCreatedOn(){
           return createdOn;
       }
       
       public void setPostCreatedOn(LocalDateTime createdOn){
           this.createdOn = createdOn; 
       }
       
       public LocalDateTime getPostLastUpdated(){
           return lastUpdated;
       }
       
       public void setPostLastUpdated(LocalDateTime lastUpdated){
           this.lastUpdated = lastUpdated; 
       }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((body == null) ? 0 : body.hashCode());
        result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
        result = prime * result + ((lastUpdated == null) ? 0 : lastUpdated.hashCode());
        result = prime * result + ((postId == null) ? 0 : postId.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Post other = (Post) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (body == null) {
            if (other.body != null)
                return false;
        } else if (!body.equals(other.body))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        } else if (!createdOn.equals(other.createdOn))
            return false;
        if (lastUpdated == null) {
            if (other.lastUpdated != null)
                return false;
        } else if (!lastUpdated.equals(other.lastUpdated))
            return false;
        if (postId == null) {
            if (other.postId != null)
                return false;
        } else if (!postId.equals(other.postId))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Post [postId=" + postId + ", title=" + title + ", body=" + body + ", author=" + author + ", createdOn="
                + createdOn + ", lastUpdated=" + lastUpdated + "]";
    }
           
}

