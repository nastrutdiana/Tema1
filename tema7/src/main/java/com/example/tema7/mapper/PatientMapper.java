package com.example.tema7.mapper;

import com.example.tema7.dto.PatientDTO;
import com.example.tema7.models.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDTO toPatientDTO(Patient patient);
}
