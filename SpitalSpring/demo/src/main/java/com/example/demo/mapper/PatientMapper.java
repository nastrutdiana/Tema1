package com.example.demo.mapper;

import com.example.demo.dto.PatientDTO;
import com.example.demo.models.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDTO toPatientDTO(Patient patient);
}
