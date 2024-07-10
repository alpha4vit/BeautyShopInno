package com.innowise.productservice.service;

import com.innowise.productservice.entity.ProductCategoryEntity;

import java.util.List;

public interface ProductCategoryService {

    ProductCategoryEntity save(ProductCategoryEntity category);

    List<ProductCategoryEntity> getAllByParentId(Long parentCategoryId);

    ProductCategoryEntity getById(Long id);

    void deleteById(Long id);

}
