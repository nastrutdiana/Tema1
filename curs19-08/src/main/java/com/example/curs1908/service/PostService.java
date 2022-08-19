package com.example.curs1908.service;

import com.example.curs1908.factory.ReactFactory;
import com.example.curs1908.model.Comment;
import com.example.curs1908.model.Post;
import com.example.curs1908.model.React;
import com.example.curs1908.model.User;
import com.example.curs1908.repository.PostRepository;
import com.example.curs1908.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public void savePost(Post post){
        postRepository.save(post);
    }

    public List<Post> getLastTenPosts(){
       // return postRepository.getTop10Posts();
        return postRepository.findAll().stream()
                .skip(postRepository.count() - 10)
                .collect(Collectors.toList());
    }
    public List<Post> getPostsWithMoreThanTenLikes(){
        return postRepository.findAll().stream()
                .filter(e -> e.getReactList().size() >=10)
                .collect(Collectors.toList());
    }
    public void addReactionToPost(Integer postId, String reaction){
        Post post = postRepository.findById(postId).get();
        post.addReaction(ReactFactory.createReact(reaction));
        postRepository.save(post);
    }

    public void addCommnet(Integer postId, String comment, Integer userId){
        Comment myComment = new Comment(null, Date.valueOf(String.valueOf(LocalDateTime.now())),
                userRepository.findById(userId).get(), comment);
        Post post = postRepository.findById(postId).get();
        post.addComment(myComment);
        postRepository.save(post);
    }
}
