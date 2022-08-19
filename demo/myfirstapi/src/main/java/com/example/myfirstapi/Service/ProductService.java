package com.example.myfirstapi.Service;

import com.example.myfirstapi.Repository.OrderRepository;
import com.example.myfirstapi.Repository.ProductRepository;
import com.example.myfirstapi.entity.Orders;
import com.example.myfirstapi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct(){
        List<Product> aux = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Optional<Product> getById(Integer id){
        return productRepository.findById(id);
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public void deleteProduct(Integer productId){
        productRepository.deleteById(productId);
    }



}
