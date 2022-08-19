package com.example.tema6.dto;


import com.example.tema6.model.Doctor;
import com.example.tema6.model.Specialty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {
    private String name;
    private Specialty specialty;

    public DoctorDTO(Doctor doctor){
        this.name = doctor.getName();
        this.specialty = doctor.getSpecialty();
    }
}
