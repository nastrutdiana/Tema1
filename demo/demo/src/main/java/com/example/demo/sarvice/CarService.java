package com.example.demo.sarvice;

import com.example.demo.dto.CarDTO;
import com.example.demo.mapper.CarMapper;
import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarMapper carMapper;

    private final CarRepository carRepository;

    public List<CarDTO> getAllCars(){
       return  carRepository.findAll().stream().map(carMapper::toCarDTO).collect(Collectors.toList());
    }

    public void deleteById(Integer id){
        carRepository.deleteById(id);
    }

    public Car save(Car c){
        return carRepository.save(c);
    }

    public CarDTO getById(Integer id){
        return carMapper.toCarDTO(carRepository.findById(id).get());
    }
}
