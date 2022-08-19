package com.example.tema7.controller;

import com.example.tema7.models.Patient;
import com.example.tema7.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patients")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("{cnp}")
    public Patient getPatientByCnp(@PathVariable String cnp){
        return patientService.getByCnp(cnp);
    }

    @PostMapping
    public void addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }

}
