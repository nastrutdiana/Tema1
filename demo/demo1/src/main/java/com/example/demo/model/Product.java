package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private String id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private Integer stock;

    @NotNull
    private Double price;

    @OneToMany
    private List<OrderDetails> orderDetails;
}
