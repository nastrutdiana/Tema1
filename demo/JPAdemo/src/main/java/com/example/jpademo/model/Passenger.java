package com.example.jpademo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {
    @Id
    @GeneratedValue
    private int id;

    private String nume;

    @ManyToOne
    private Car car;
}
