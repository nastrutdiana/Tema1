package com.example.curs1908.model;

import com.example.curs1908.observer.PostObserver;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private User user;
    @OneToMany
    private List<Comment> list;

    @OneToMany
    private List<React> reactList;

    private String content;
    @Transient
    PostObserver observer;

    public void addObserver(){
        observer = new PostObserver(this);
    }

    public void addComment(Comment comment){
        list.add(comment);
        observer.notify(comment);
    }
    public void addReaction(React react){
        reactList.add(react);
    }

}
