package com.example.tema6.service;


import com.example.tema6.dto.DoctorDTO;
import com.example.tema6.exceptions.NoDoctorException;
import com.example.tema6.mapper.DoctorMapper;
import com.example.tema6.model.Doctor;
import com.example.tema6.model.Patient;
import com.example.tema6.model.Specialty;
import com.example.tema6.repository.DoctorRepository;
import com.example.tema6.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorService {

    final DoctorRepository doctorRepository;
    final PatientRepository patientRepository;
    final DoctorMapper doctorMapper;

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }
    public List<DoctorDTO> getAllDoctorsDTO(){
        return doctorRepository.findAll().stream()
                .map(doctorMapper::toDoctorDTO)
                .collect(Collectors.toList());
    }

    public Doctor save(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public void addPatient(Integer doctorId, Integer patientId) throws NoDoctorException {
        Doctor doctor = doctorRepository.getById(doctorId);
        if(doctor == null){
           throw new NoDoctorException();
        }
        else {
            Patient patient = patientRepository.getById(patientId);
            if (patient != null) {
                doctorRepository.getById(doctorId).addPatient(patient);
            }
        }
    }

    public List<Doctor> getAllBySpecialty(Specialty specialty){
        return doctorRepository.getAllBySpecialty(specialty);
    }

    public List<DoctorDTO> getAllBySpecialtyDTO(Specialty specialty){
        return doctorRepository.getAllBySpecialty(specialty).stream()
                .map(doctorMapper::toDoctorDTO)
                .collect(Collectors.toList());
    }

    public void deleteById(Integer id){
        doctorRepository.deleteById(id);
    }


}
