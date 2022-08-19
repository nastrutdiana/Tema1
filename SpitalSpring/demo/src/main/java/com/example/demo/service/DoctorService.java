package com.example.demo.service;

import com.example.demo.exception.NoDoctorException;
import com.example.demo.mapper.DoctorMapper;
import com.example.demo.models.Doctor;
import com.example.demo.models.Patient;
import com.example.demo.models.Specialty;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    @Autowired
    private final DoctorRepository doctorRepository;
    @Autowired
    private final PatientRepository patientRepository;
    //private final DoctorMapper doctorMapper;
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public void addPatient(Integer doctorId, Integer patientId) throws NoDoctorException {
        Doctor d = doctorRepository.getById(doctorId);

            if(d==null){
                throw new NoDoctorException();
            }else {
                Patient p = patientRepository.getById(patientId);
                if(p!=null) {
                    d.addPatient(p);
                }

            }
    }

    public void addDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }
    public List<Doctor> getAllBySpeciality(Specialty speciality){
        return doctorRepository.getAllBySpeciality(speciality);
    }

    public List<Patient> getAllByDoctor(Doctor doctor){
        return patientRepository.getAllByDoctor(doctor);
    }
}
