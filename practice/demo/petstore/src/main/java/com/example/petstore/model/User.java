package com.example.petstore.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    UserType userType;
    String username;
    @OneToMany
    @JsonManagedReference
    List<PurchaseHistory> purchaseHistory;
}
