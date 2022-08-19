package com.example.tema6.mapper;


import com.example.tema6.dto.DoctorDTO;
import com.example.tema6.model.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    DoctorDTO toDoctorDTO(Doctor Doctor);
}
