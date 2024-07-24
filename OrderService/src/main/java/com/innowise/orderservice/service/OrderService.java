package com.innowise.orderservice.service;

import com.innowise.orderservice.entity.OrderEntity;

import java.util.List;

public interface OrderService {

    OrderEntity getById(Long id);

    List<OrderEntity> getAll();

    OrderEntity save(OrderEntity order);

    void deleteById(Long id);

    OrderEntity update(Long id, OrderEntity order);

    List<OrderEntity> getAllByUserId(Long userId);

}
