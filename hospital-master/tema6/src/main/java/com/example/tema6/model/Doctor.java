package com.example.tema6.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue
    Integer id;
    @NotNull
    String name;
    @OneToMany
    List<Patient> patientList;
    Specialty specialty;

    public void addPatient(Patient patient) {
        patientList.add(patient);
        System.out.println("All good. Added patient: " + patient + "\nTo doctor: " + this);
    }

}
