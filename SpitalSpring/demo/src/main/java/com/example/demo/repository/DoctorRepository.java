package com.example.demo.repository;

import com.example.demo.models.Doctor;
import com.example.demo.models.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findAll();
    Doctor getById(Integer id);
    List<Doctor> getAllBySpeciality(Specialty speciality);
}
