package com.example.tema6.mapper;


import com.example.tema6.dto.PatientDTO;
import com.example.tema6.model.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDTO toPatientDTO(Patient patient);
}
