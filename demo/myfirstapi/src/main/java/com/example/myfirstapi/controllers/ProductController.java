package com.example.myfirstapi.controllers;

import com.example.myfirstapi.Service.ProductService;
import com.example.myfirstapi.entity.Customer;
import com.example.myfirstapi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAllOrders(){
        return productService.getAllProduct();
    }

    @GetMapping("{id}")
    public Optional<Product> getById(@PathVariable Integer id){
        return productService.getById(id);
    }

    @PostMapping
    public void insertProduct(@RequestBody Product product){
        productService.save(product);
    }

    @PutMapping
    public void updateProduct(@PathVariable Product product){
        productService.save(product);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable(value = "id") Integer productId){
        productService.deleteProduct(productId);
    }
}
