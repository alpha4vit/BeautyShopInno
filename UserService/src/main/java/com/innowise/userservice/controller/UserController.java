package com.innowise.userservice.controller;

import com.innowise.userservice.dto.User;
import com.innowise.userservice.service.UserService;
import com.innowise.userservice.util.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable("id") Long id){
        var user = userService.getById(id);
        return ResponseEntity.ok(userMapper.toDTO(user));
    }

}
