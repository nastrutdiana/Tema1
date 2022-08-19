package com.example.tema7.models;


import com.example.tema7.observer.PatientObserver;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Observable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Patient extends Observable {
    @Id
    @GeneratedValue
    Integer id;
    @NotNull
    String cnp;
    @NotNull
    @OneToMany
    List<Visit> visits;
    @ManyToOne
    @JsonBackReference
    Doctor doctor;
    @Transient
    PatientObserver patientObserver;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
        patientObserver.update(this, patientObserver);
    }
}
