package com.example.tema7.dto;

import com.example.tema7.models.Doctor;
import com.example.tema7.models.Specialty;
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
        this.specialty = doctor.getSpecialty();
    }
}
