package com.example.demo.controller;

import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor

public class ProductViewController {
    private final ProductService productService;

    @GetMapping("products")
    public String getProducts(Model model){
        model.addAttribute("product",productService.getProducts());
        return "products";
    }
}
