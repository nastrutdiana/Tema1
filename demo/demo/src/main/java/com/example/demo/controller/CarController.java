package com.example.demo.controller;

import com.example.demo.dto.CarDTO;
import com.example.demo.model.Car;
import com.example.demo.sarvice.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public List<CarDTO> getAllCars(){
        return carService.getAllCars();
    }

    @PostMapping
    public Car saveCar(@RequestBody Car car){
        return  carService.save(car);
    }

    @DeleteMapping
    public void deleteCar(Integer id){
        carService.deleteById(id);
    }

    @GetMapping("{id}")
    public CarDTO getById(@PathVariable Integer id){
        return carService.getById(id);
    }
}
