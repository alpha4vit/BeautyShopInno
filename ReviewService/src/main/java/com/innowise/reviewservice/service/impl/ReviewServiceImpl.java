package com.innowise.reviewservice.service.impl;

import com.innowise.reviewservice.entity.ReviewEntity;
import com.innowise.reviewservice.exception.exceptions.EntityNotFoundException;
import com.innowise.reviewservice.repository.ReviewRepository;
import com.innowise.reviewservice.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> getAllByProductId(Long productId) {
        return reviewRepository.findAllByProductId(productId);
    }

    @Override
    public List<ReviewEntity> getAllByUserId(Long userId) {
        return reviewRepository.findAllByUserId(userId);
    }

    @Override
    public ReviewEntity save(ReviewEntity review) {
        return reviewRepository.save(review);
    }

    @Override
    public ReviewEntity getById(Long id) {
        return reviewRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Review with this id not found!"));
    }

    @Override
    public void deleteById(Long id) {
        var review = getById(id);
        reviewRepository.delete(review);
    }
}
