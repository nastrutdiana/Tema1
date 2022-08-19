package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Date orderDate;

    private Date shippedDate;

    @NotNull
    private String status;

    private String comments;

    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<OrderDetails> orderDetails;
}
