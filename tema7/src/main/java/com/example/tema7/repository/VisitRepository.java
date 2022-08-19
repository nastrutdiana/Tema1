package com.example.tema7.repository;

import com.example.tema7.models.Specialty;
import com.example.tema7.models.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer> {
    List<Visit> findAll();
    //List<Visit> findByCnpAndSpeciality(String cnp, Specialty specialty);
}
