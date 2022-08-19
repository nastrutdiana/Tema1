package com.example.tema6.controller;


import com.example.tema6.dto.DoctorDTO;
import com.example.tema6.exceptions.NoDoctorException;
import com.example.tema6.model.Doctor;
import com.example.tema6.model.Specialty;
import com.example.tema6.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("doctors")
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping("all")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @GetMapping("dto/all")
    public List<DoctorDTO> getAllDoctorsDTO(){
        return doctorService.getAllDoctorsDTO();
    }

    @GetMapping("{specialty}")
    public List<Doctor> getAllBySpecialty(@PathVariable Specialty specialty){
        return doctorService.getAllBySpecialty(specialty);
    }

    @GetMapping("dto/{specialty}")
    public List<DoctorDTO> getAllBySpecialtyDTO(@PathVariable Specialty specialty){
        return doctorService.getAllBySpecialtyDTO(specialty);
    }

    @PostMapping("addpatient/{doctorId}/{patientId}")
    public void addPatient(@PathVariable Integer doctorId, @PathVariable Integer patientId) throws NoDoctorException {
        doctorService.addPatient(doctorId,patientId);
    }
    @PostMapping("save")
    public void saveDoctor(@RequestBody Doctor doctor){
        doctorService.save(doctor);
    }
    @DeleteMapping("delete/{id}")
    public void deleteDoctor(@PathVariable Integer id){
        doctorService.deleteById(id);
    }

}
