package com.example.demo.service;

import com.example.demo.models.Patient;
import com.example.demo.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    final PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
    public Patient getByCnp(String cnp){
        return patientRepository.getByCnp(cnp);
    }

}
