package com.example.tema6.controller;


import com.example.tema6.dto.PatientDTO;
import com.example.tema6.model.Doctor;
import com.example.tema6.model.Patient;
import com.example.tema6.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("patients")
public class PatientController {

    private final PatientService patientService;

    @GetMapping("all")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("dto/all")
    public List<PatientDTO> getAllPatientsDTO(){
        return patientService.getAllPatientsDTO();
    }

    @GetMapping("{id}")
    public Patient getPatientById(@PathVariable Integer id){
        return patientService.getPatientById(id);
    }

    @GetMapping("dto/{id}")
    public PatientDTO getPatientDTOById(@PathVariable Integer id){
        return patientService.getPatientDTOById(id);
    }

    @GetMapping("doctor")
    public List<Patient> getAllPatientsByDoctor(@RequestBody Doctor doctor){
        return patientService.getAllByDoctor(doctor);
    }

    @GetMapping("dto/doctor")
    public List<PatientDTO> getAllDTOByDoctor(@RequestBody Doctor doctor){
        return patientService.getAllDTOByDoctor(doctor);
    }

    @PostMapping("save")
    public void savePatient(@RequestBody Patient patient){
        patientService.savePatient(patient);
    }



}
