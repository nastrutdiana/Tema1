package com.example.demo.mapper;

import com.example.demo.dto.DoctorDTO;
import com.example.demo.models.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface DoctorMapper {
    DoctorDTO toDoctorDTO(Doctor doctor);
}
