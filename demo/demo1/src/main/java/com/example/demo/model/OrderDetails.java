package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Integer quantity;

    @NotNull
    private Double priceEach;

    @ManyToOne
    private Product product;
}
