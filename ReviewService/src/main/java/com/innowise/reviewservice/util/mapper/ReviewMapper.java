package com.innowise.reviewservice.util.mapper;

import com.innowise.reviewservice.dto.dto.Review;
import com.innowise.reviewservice.entity.ReviewEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING
)
public interface ReviewMapper {

    Review toDto(ReviewEntity entity);

    ReviewEntity toEntity(Review dto);

    List<Review> toDtos(List<ReviewEntity> entities);

    List<ReviewEntity> toEntities(List<Review> dtos);

}
