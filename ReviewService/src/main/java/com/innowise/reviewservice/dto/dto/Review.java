package com.innowise.reviewservice.dto.dto;

public record Review(

        String id,

        Integer stars,

        String comment,

        Long productId,

        Long userId

) {
}
