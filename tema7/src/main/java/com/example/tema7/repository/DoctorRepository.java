package com.example.tema7.repository;

import com.example.tema7.models.Doctor;
import com.example.tema7.models.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findAll();
    Doctor getById(Integer id);
    List<Doctor> getAllBySpecialty(Specialty speciality);
}
