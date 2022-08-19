package com.example.myfirstapi.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String name;
    private Double price;
}
