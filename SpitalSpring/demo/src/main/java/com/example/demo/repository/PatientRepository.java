package com.example.demo.repository;

import com.example.demo.models.Doctor;
import com.example.demo.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    List<Patient> findAll();
    Patient getById(Integer id);
    Patient getByCnp(String cnp);
    List<Patient> getAllByDoctor(Doctor doctor);
}
