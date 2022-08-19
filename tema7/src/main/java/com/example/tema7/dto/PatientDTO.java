package com.example.tema7.dto;

import com.example.tema7.models.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
    String cnp;
    String doctorName;


    public PatientDTO(Patient p){
        this.cnp = p.getCnp();
        this.doctorName = p.getDoctor().getName();
    }
}
