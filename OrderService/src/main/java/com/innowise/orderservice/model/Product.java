package com.innowise.orderservice.model;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Product {
    @Id
    private Long id;
}
