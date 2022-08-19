package com.example.tema7.observer;//package com.example.demo.observer;



import java.util.Observable;
import java.util.Observer;

public class PatientObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("You are new patient");
    }
}
