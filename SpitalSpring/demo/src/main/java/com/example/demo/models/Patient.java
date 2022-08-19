package com.example.demo.models;


//import com.example.demo.observer.PatientObserver;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
//    @Transient
//    PatientObserver patientObserver;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
        //patientObserver.update(this, patientObserver);
    }
}
