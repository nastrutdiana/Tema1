package com.example.tema6.exceptions;

public class NoSpecialtyException extends Exception{
    public NoSpecialtyException(){
        super("This specialty doesn't exist!");
    }
}
