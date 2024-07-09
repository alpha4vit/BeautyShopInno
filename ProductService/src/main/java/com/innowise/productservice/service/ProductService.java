package com.innowise.productservice.service;

import com.innowise.productservice.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    ProductEntity getById(Long id);

    List<ProductEntity> getAll();

    ProductEntity save(ProductEntity product);

    List<ProductEntity> getAllByCategoryId(Long categoryId);

}
