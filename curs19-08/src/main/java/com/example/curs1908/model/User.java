package com.example.curs1908.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String birthDate;
    @NotNull
    private String email;
    private String country;
    private String job;
    @NotNull
    private String password;
}
