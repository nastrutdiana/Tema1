package com.example.tema6.dto;


import com.example.tema6.model.Patient;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatientDTO {
    String cnp;
    String doctorName;

    PatientDTO(Patient patient){
        this.cnp = patient.getCnp();
        this.doctorName=patient.getDoctor().getName();
    }
}
