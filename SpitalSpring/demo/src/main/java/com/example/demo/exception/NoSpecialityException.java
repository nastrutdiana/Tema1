package com.example.demo.exception;

public class NoSpecialityException extends Exception{
    public NoSpecialityException(){
        super("Speciality doesn't exist");
    }
}
