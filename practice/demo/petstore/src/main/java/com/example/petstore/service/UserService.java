package com.example.petstore.service;

import com.example.petstore.model.Pet;
import com.example.petstore.model.PurchaseHistory;
import com.example.petstore.model.User;
import com.example.petstore.model.UserType;
import com.example.petstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PurchaseHistoryService purchaseHistoryService;
    private final PetService petService;

    private User saveUser(User user, Optional<Integer> requestantId){
        if(user.getUserType() == UserType.CLIENT)
            return userRepository.save(user);
        else if(user.getUserType() == UserType.OWNER &&
                requestantId.isPresent()){
            if(isAdmin(requestantId.get()))
                return userRepository.save(user);
        }
        return null;
    }

    public User getUserById(Integer id){
        if (userRepository.findById(id).isPresent())
            return userRepository.findById(id).get();
        else return null;
    }

    public boolean isAdmin(Integer userId){
        Optional<User> user = userRepository.findById(userId);
        return user.isPresent() && user.get().getUserType()==UserType.OWNER;
    }

    public void putchasePet(Integer petId, Integer userId){
        Optional<User> userOptional = userRepository.findById(userId);
        if(!userOptional.isPresent()){
            return;
        }
        if (petService.getPetStock(petId) > 0){
            User user = userOptional.get();
            user.getPurchaseHistory().add(purchaseHistoryService.savePurchaseHistory(user, petId));
            purchaseHistoryService.updateStock(petId);
        }


    }

}
