package com.innowise.orderservice.controller;

import com.innowise.orderservice.dto.Order;
import com.innowise.orderservice.service.OrderService;
import com.innowise.orderservice.util.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    
    private final OrderService orderService;
    private final OrderMapper orderMapper;

    @GetMapping("/{id}")
    public ResponseEntity<Order> getById(@PathVariable("id") Long id){
        var product = orderService.getById(id);
        return ResponseEntity.ok(orderMapper.toDTO(product));
    }

    @PostMapping
    public ResponseEntity<Order> save(@RequestBody Order dto){
        var saved = orderService.save(orderMapper.toEntity(dto));
        return ResponseEntity.ok(orderMapper.toDTO(saved));
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAll(){
        var orders = orderService.getAll();
        return ResponseEntity.ok(orderMapper.toDTOs(orders));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable("id") Long orderId){
        orderService.deleteById(orderId);
    }

    @GetMapping("/user/{user_id}")
    public ResponseEntity<List<Order>> getAllByUserId(@PathVariable("user_id") Long userId){
        var orders = orderService.getAllByUserId(userId);
        return ResponseEntity.ok(orderMapper.toDTOs(orders));
    }
}
