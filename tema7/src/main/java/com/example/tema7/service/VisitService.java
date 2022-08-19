package com.example.tema7.service;

import com.example.tema7.models.Specialty;
import com.example.tema7.models.Visit;
import com.example.tema7.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitService {
    @Autowired
    private final VisitRepository visitRepository;
    public List<Visit> getAllVisits(){
        return visitRepository.findAll();
    }
//    public List<Visit> getByCnpAndSpecialty(String cnp, Specialty specialty){
//        return visitRepository.findByCnpAndSpeciality(cnp, specialty);
//    }
    public void addVisit(Visit visit){
        visitRepository.save(visit);
    }
}
