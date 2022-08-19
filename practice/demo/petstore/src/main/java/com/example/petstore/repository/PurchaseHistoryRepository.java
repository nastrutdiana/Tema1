package com.example.petstore.repository;

import com.example.petstore.model.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Integer> {
    List<PurchaseHistory> findAll();

}
