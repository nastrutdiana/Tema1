package com.example.tema7.mapper;

import com.example.tema7.dto.DoctorDTO;
import com.example.tema7.models.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface DoctorMapper {
    DoctorDTO toDoctorDTO(Doctor doctor);
}
