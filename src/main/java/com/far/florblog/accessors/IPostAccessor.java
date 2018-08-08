package com.far.florblog.accessors;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.far.florblog.domains.Post;


public interface IPostAccessor extends JpaRepository<Post, Long>{

    List<Post> findAllByAuthor(String author);
    
//    List<Post> findAllByTitleContainsAndBodyContains(String title, String body);
    
}

