package com.example.tema7.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    Specialty specialty;

    public void addPatient(Patient patient){
            this.patientList.add(patient);
    }
}
