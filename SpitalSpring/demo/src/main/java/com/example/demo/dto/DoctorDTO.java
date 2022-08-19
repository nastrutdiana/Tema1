package com.example.demo.dto;

import com.example.demo.models.Doctor;
import com.example.demo.models.Specialty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {
    String name;
    Specialty specialty;

    public DoctorDTO(Doctor doctor){
        this.name = doctor.getName();
        this.specialty = doctor.getSpeciality();
    }
}
