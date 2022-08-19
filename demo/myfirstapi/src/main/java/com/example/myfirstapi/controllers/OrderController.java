package com.example.myfirstapi.controllers;

import com.example.myfirstapi.Service.OrderService;
import com.example.myfirstapi.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public List<Orders> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("{id}")
    public Optional<Orders> getById(@PathVariable Integer id){
        return orderService.getById(id);
    }

    @PostMapping
    public void insertOrder(@RequestBody Orders order){
        orderService.save(order);
    }

    @PutMapping
    public void updateOrder(@RequestBody Orders order){
        orderService.save(order);
    }

    @DeleteMapping("{id}")
    public void deleteOrder(@PathVariable(value = "id") Integer orderId){
        orderService.deleteOrder(orderId);
    }

}
