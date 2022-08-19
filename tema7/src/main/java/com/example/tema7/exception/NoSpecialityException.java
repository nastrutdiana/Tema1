package com.example.tema7.exception;

public class NoSpecialityException extends Exception{
    public NoSpecialityException(){
        super("Speciality doesn't exist");
    }
}
