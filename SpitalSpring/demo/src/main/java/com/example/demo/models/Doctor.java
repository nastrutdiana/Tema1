package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue
    Integer id;
    @NotNull
    String name;
    @OneToMany
    @JsonManagedReference
    List<Patient> patientList;
    Specialty speciality;

    public void addPatient(Patient patient){
            this.patientList.add(patient);
    }
}
