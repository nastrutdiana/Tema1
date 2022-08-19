package com.example.petstore.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    PetType petType;
    String petName;
    @NotNull
    Integer stock;
    @OneToMany
    @JsonManagedReference
    List<PurchaseHistory> purchaseHistory;
}
