package com.example.tema7.controller;

import com.example.tema7.exception.NoDoctorException;
import com.example.tema7.models.Doctor;
import com.example.tema7.models.Specialty;
import com.example.tema7.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("doctors")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @PostMapping
    public void addDoctor(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
    }

    @PostMapping("addpatient/{doctorId}/{patientId}")
    public void addPatient(@PathVariable("doctorId") Integer doctorId,@PathVariable("patientId") Integer patientId) throws NoDoctorException {
        doctorService.addPatient(doctorId, patientId);
    }

    @GetMapping("{specialty}")
    public List<Doctor> getSpecialty(@PathVariable Specialty specialty){
        return doctorService.getAllBySpecialty(specialty);
    }
}
