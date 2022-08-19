package com.example.myfirstapi.Service;

import com.example.myfirstapi.Repository.CustomerRepository;
import com.example.myfirstapi.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAllCustomers(){
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Customer> getCustomerById(Integer id){
        return customerRepository.findById(id);
    }

    public void save(Customer customer){
        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer Customerid){
        customerRepository.deleteById(Customerid);
    }


}



