package com.example.curs1908.controller;

import com.example.curs1908.model.Post;
import com.example.curs1908.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("post")
public class PostController {
    private final PostService postService;

    @PostMapping
    public void savePost(@RequestBody Post post){
        postService.savePost(post);
    }
    @GetMapping("last-ten")
    public List<Post> getLastTenPosts(){
        return postService.getLastTenPosts();
    }

    @GetMapping("ten-react")
    public List<Post> getPostWithMoreThan10ReacT(){
        return postService.getPostsWithMoreThanTenLikes();
    }
    @PostMapping("add-react/{postId}/{reactId}")
    public void addReact(@PathVariable Integer postId, @PathVariable String react){
        postService.addReactionToPost(postId, react);
    }

    @PostMapping("add-comment/{userId}/{postId}/{comment}")
    public void addCommentToPost(@PathVariable Integer userId, @PathVariable Integer postId, @PathVariable String comment){
        postService.addCommnet(postId,comment,userId);
    }
}
