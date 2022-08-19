package com.example.myfirstapi.Service;

import com.example.myfirstapi.Repository.CustomerRepository;
import com.example.myfirstapi.Repository.OrderRepository;
import com.example.myfirstapi.entity.Customer;
import com.example.myfirstapi.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public List<Orders> getAllOrders(){
        List<Orders> aux = new ArrayList<>();
        orderRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Orders> getById(Integer id){
        return orderRepository.findById(id);
    }

    public void save(Orders order){
        orderRepository.save(order);
    }

    public void deleteOrder(Integer Orderid){
        orderRepository.deleteById(Orderid);
    }

}
