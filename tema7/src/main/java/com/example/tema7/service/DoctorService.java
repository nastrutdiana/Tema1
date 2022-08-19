package com.example.tema7.service;

import com.example.tema7.exception.NoDoctorException;
import com.example.tema7.models.Doctor;
import com.example.tema7.models.Patient;
import com.example.tema7.models.Specialty;
import com.example.tema7.repository.DoctorRepository;
import com.example.tema7.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    @Autowired
    private final DoctorRepository doctorRepository;
    @Autowired
    private final PatientRepository patientRepository;
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
    public List<Doctor> getAllBySpecialty(Specialty speciality){
        return doctorRepository.getAllBySpecialty(speciality);
    }

    public List<Patient> getAllByDoctor(Doctor doctor){
        return patientRepository.getAllByDoctor(doctor);
    }
}
