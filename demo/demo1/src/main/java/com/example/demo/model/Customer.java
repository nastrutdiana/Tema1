package com.example.demo.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String userName;

    @NotNull
    private String lastName;

    @NotNull
    private String firstName;

    @NotNull
    private String phone;

    @NotNull
    private String address;

    @NotNull
    private String city;

    private String postalCode;

    @NotNull
    private String country;

    @OneToMany
    List<Payment> list;
}
