package com.example.curs1908.observer;

import com.example.curs1908.model.Comment;
import com.example.curs1908.model.Post;

public class PostObserver {

    private Post observedPost;
    public PostObserver(Post p){
        this.observedPost = p;
    }

    public void notify(Comment comment) {
        System.out.println(observedPost.getUser().getName() + " You have a new comment " + comment.getContent());
    }
}
