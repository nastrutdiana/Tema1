package com.example.petstore.service;

import com.example.petstore.model.Pet;
import com.example.petstore.model.PurchaseHistory;
import com.example.petstore.model.User;
import com.example.petstore.repository.PetRepository;
import com.example.petstore.repository.PurchaseHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;

@Service
@RequiredArgsConstructor
public class PurchaseHistoryService {
    private final PurchaseHistoryRepository putchaseHistoryRepository;
    private final PetRepository petRepository;

    public PurchaseHistory savePurchaseHistory(User user, Integer petId){
        return putchaseHistoryRepository.save(PurchaseHistory.builder().user(user).pet(petRepository.findById(petId).get()).build());
    }
    public void updateStock(Integer id){
        petRepository.decrementStock(id);
    }
}
