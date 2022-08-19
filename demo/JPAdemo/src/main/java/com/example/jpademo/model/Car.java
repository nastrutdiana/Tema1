package com.example.jpademo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private String serialNumber;

    @Column(name = "power")
    private int horsePower;

    @Transient
    private int noOfDoors;

    @OneToMany
    private List<Passenger> passengerList;
}
