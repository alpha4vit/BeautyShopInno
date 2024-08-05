package com.innowise.productservice.service.impl;

import com.innowise.productservice.entity.MeasurementTypeEntity;
import com.innowise.productservice.repository.MeasurementTypeRepository;
import com.innowise.productservice.service.MeasurementTypeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeasurementTypeServiceImpl implements MeasurementTypeService {

    private final MeasurementTypeRepository measurementTypeRepository;

    @Override
    public MeasurementTypeEntity getById(Long id) {
        return measurementTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Measurement type with this id not found!"));
    }
}
