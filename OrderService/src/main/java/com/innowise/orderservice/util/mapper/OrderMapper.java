package com.innowise.orderservice.util.mapper;

import com.innowise.orderservice.dto.Order;
import com.innowise.orderservice.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {

    Order toDTO(OrderEntity entity);

    OrderEntity toEntity(Order dto);

    List<Order> toDTOs(List<OrderEntity> products);

    List<OrderEntity> toEntities(List<Order> dtos);

}
