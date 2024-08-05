package com.innowise.reviewservice.controller;

import com.innowise.reviewservice.dto.dto.Review;
import com.innowise.reviewservice.service.ReviewService;
import com.innowise.reviewservice.util.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;
    private final ReviewMapper reviewMapper;

    @GetMapping("/users/{user_id}")
    public List<Review> getAllByUser(@PathVariable("user_id") Long userId){
        var reviews = reviewService.getAllByUserId(userId);
        return reviewMapper.toDtos(reviews);
    }

    @GetMapping("/users/{product_id}")
    public List<Review> getAllByProduct(@PathVariable("product_id") Long productId){
        var reviews = reviewService.getAllByProductId(productId);
        return reviewMapper.toDtos(reviews);
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable("id") Long id){
        var review = reviewService.getById(id);
        return reviewMapper.toDto(review);
    }

    @PostMapping
    public Review save(@RequestBody Review review){
        var saved = reviewService.save(reviewMapper.toEntity(review));
        return reviewMapper.toDto(saved);
    }

}
