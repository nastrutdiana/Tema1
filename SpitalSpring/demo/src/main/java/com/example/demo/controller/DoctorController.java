package com.example.demo.controller;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.exception.NoDoctorException;
import com.example.demo.models.Doctor;
import com.example.demo.models.Specialty;
import com.example.demo.service.DoctorService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
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
        return doctorService.getAllBySpeciality(specialty);
    }
}
