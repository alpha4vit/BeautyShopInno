package com.innowise.reviewservice.repository;

import com.innowise.reviewservice.entity.ReviewEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends MongoRepository<ReviewEntity, Long> {

    List<ReviewEntity> findAllByProductId(Long productId);

    List<ReviewEntity> findAllByUserId(Long productId);

}
