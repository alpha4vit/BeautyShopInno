package com.innowise.userservice.service;

import com.innowise.userservice.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity getById(Long id);

    List<UserEntity> getAll();

}
