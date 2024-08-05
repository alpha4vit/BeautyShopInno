package com.innowise.reviewservice.exception.exceptions;

import lombok.Data;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }
}
