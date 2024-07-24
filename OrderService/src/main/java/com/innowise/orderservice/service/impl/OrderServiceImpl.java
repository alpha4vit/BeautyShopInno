package com.innowise.orderservice.service.impl;

import com.innowise.orderservice.entity.OrderEntity;
import com.innowise.orderservice.repository.OrderRepository;
import com.innowise.orderservice.service.OrderService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public OrderEntity getById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Order with this id not found!"));
    }

    @Override
    public List<OrderEntity> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public OrderEntity save(OrderEntity order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteById(Long id) {
        getById(id);
        orderRepository.deleteById(id);
    }

    @Override
    public OrderEntity update(Long id, OrderEntity order) {
        var orderForUpdate = getById(id);
        order.setId(orderForUpdate.getId());
        return orderRepository.save(order);
    }

    @Override
    public List<OrderEntity> getAllByUserId(Long userId) {
        return orderRepository.findAllByUserId(userId);
    }
}
