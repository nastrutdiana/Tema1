package com.example.curs1908.repository;

import com.example.curs1908.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findAll();
    //List<Post> getTop10Posts();
}
