package com.example.tema7.controller;

import com.example.tema7.models.Specialty;
import com.example.tema7.models.Visit;
import com.example.tema7.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visits")
public class VisitController {
    @Autowired
    VisitService visitService;

    @GetMapping
    public List<Visit> getAllVisits(){
        return visitService.getAllVisits();
    }

//    @GetMapping("{cnp}/{specialty}")
//    public List<Visit> getByCnpAndSpecialty(@PathVariable("cnp") String cnp,@PathVariable("specialty") Specialty specialty){
//        return visitService.getByCnpAndSpecialty(cnp,specialty);
//    }

    @PostMapping
    public void addVisit(@RequestBody Visit visit){
        visitService.addVisit(visit);
    }
}
