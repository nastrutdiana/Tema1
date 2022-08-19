package com.example.tema7.repository;

import com.example.tema7.models.Doctor;
import com.example.tema7.models.Patient;
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
