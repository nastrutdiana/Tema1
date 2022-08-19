package com.example.demo.controller;

import com.example.demo.models.Patient;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
