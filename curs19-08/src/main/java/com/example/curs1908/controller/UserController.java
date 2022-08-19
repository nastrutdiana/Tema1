package com.example.curs1908.controller;

import com.example.curs1908.model.User;
import com.example.curs1908.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;
    @GetMapping("get/{name}")
    public List<User> getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @PostMapping
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
