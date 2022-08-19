package com.example.petstore.service;

import com.example.petstore.model.Event;
import com.example.petstore.model.Pet;
import com.example.petstore.model.User;
import com.example.petstore.repository.EventRepository;
import com.example.petstore.repository.PetRepository;
import com.example.petstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.management.OperatingSystemMXBean;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;
    private final EventRepository eventRepository;
    public Pet savePet(Pet pet){
        return petRepository.save(pet);
    }
    public Integer getPetStock(Integer petId){
        Optional<Pet> petOptional = petRepository.findById(petId);
        if(petOptional.isPresent() && petOptional.get().getStock() >0){
            return petOptional.get().getStock();
        }
        eventRepository.save(Event.builder().event("Stock 0 for pet" + petOptional.get().getPetName()).build());
        return 0;
    }
}
