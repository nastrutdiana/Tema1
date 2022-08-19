package com.example.myfirstapi.controllers;

import com.example.myfirstapi.Service.CustomerService;
import com.example.myfirstapi.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("{id}")
    public Optional<Customer> getById(@PathVariable Integer id){
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public void insertCustomers(@RequestBody Customer customer){
        customerService.save(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer){
        customerService.save(customer);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable(value = "id") Integer customerId){
        customerService.deleteCustomer(customerId);
    }

}
