package com.example.petstore.facade;

import com.example.petstore.model.Pet;
import com.example.petstore.service.PetService;
import com.example.petstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PetFacade {
    private final UserService userService;

    private final PetService petService;

    public Pet savePet(Pet pet, Integer requestantId) {
        if (!userService.isAdmin(requestantId))
            return null;
        return petService.savePet(pet);
    }
}
