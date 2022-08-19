package com.example.myfirstapi.mapper;

import com.example.myfirstapi.dto.ProductDTO;
import com.example.myfirstapi.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.Mapping;


public interface ProductMapper {
    ModelMapper modelMapper = new ModelMapper();

    ProductDTO toProductDTO(Product product);
}
