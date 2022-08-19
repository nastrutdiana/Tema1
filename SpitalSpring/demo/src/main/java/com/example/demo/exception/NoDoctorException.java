package com.example.demo.exception;

public class NoDoctorException extends Exception{
    public NoDoctorException(){
        super("Doctor doesn't exist!");
    }
}
