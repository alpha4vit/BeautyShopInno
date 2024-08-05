package com.innowise.userservice.service.impl;

import com.innowise.userservice.entity.UserEntity;
import com.innowise.userservice.repository.UserRepository;
import com.innowise.userservice.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserEntity getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with this id not found!"));
    }

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }
}
