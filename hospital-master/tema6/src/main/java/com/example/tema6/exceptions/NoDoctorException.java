package com.example.tema6.exceptions;


public class NoDoctorException extends Exception{
    public NoDoctorException(){
        super("This doctor doesn't exist!");
    }
}
