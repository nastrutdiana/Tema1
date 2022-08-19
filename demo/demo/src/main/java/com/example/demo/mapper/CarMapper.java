package com.example.demo.mapper;

import com.example.demo.dto.CarDTO;
import com.example.demo.model.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDTO toCarDTO(Car car);
}
