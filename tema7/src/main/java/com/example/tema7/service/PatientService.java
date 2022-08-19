package com.example.tema7.service;

import com.example.tema7.models.Patient;
import com.example.tema7.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    @Autowired
    final PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
    public Patient getByCnp(String cnp){
        return patientRepository.getByCnp(cnp);
    }
    public void addPatient(Patient patient){
        patientRepository.save(patient);
    }

}
