package com.example.tema7.exception;

public class NoDoctorException extends Exception{
    public NoDoctorException(){
        super("Doctor doesn't exist!");
    }
}
