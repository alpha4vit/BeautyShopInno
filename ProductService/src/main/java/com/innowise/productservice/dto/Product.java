package com.innowise.productservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.innowise.productservice.entity.MeasurementTypeEntity;

import java.math.BigDecimal;
import java.util.List;

public record Product(

        Long id,

        String name,

        String description,

        String applying,

        @JsonProperty(value = "original_price")
        BigDecimal originalPrice,

        //TODO currency

        String size,

        @JsonProperty(value = "measurement_type_id")
        Long measurementTypeId,

        String units,

        @JsonProperty(value = "product_category")
        ProductCategory category,

        List<ImageResponse> images


        ) {
}
