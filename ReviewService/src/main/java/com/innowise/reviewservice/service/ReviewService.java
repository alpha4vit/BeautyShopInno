package com.innowise.reviewservice.service;

import com.innowise.reviewservice.entity.ReviewEntity;

import java.util.List;

public interface ReviewService {

    List<ReviewEntity> getAllByProductId(Long productId);

    List<ReviewEntity> getAllByUserId(Long userId);

    ReviewEntity save(ReviewEntity review);

    ReviewEntity getById(Long id);

    void deleteById(Long id);

}
