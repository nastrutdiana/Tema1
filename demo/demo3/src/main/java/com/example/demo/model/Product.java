package com.example.demo.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private Double price;
    @NotNull
    private Double quantity;
}
