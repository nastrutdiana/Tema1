package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Date paymentDate;

    @NotNull
    private Double amount;

    @ManyToOne
    private Customer customer;
}
