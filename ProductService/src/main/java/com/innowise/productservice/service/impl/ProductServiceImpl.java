package com.innowise.productservice.service.impl;

import com.innowise.productservice.entity.ProductEntity;
import com.innowise.productservice.repository.ProductRepository;
import com.innowise.productservice.service.MeasurementTypeService;
import com.innowise.productservice.service.ProductCategoryService;
import com.innowise.productservice.service.ProductService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductCategoryService productCategoryService;
    private final MeasurementTypeService measurementTypeService;

    @Override
    public ProductEntity getById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product with this id bot found!"));
    }

    @Override
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    @Transactional
    public ProductEntity save(ProductEntity product) {
        var category = productCategoryService.getById(product.getCategory().getId());
        var measurementType = measurementTypeService.getById(product.getMeasurementType().getId());
        product.setCategory(category);
        product.setMeasurementType(measurementType);
        return productRepository.save(product);
    }

    @Override
    public List<ProductEntity> getAllByCategoryId(Long categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }
}
