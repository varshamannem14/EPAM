package com.epam.jml0;

public class PayrollException extends Exception {

    public PayrollException(String message){
        super(message);
    }

    public PayrollException(String message,Throwable cause){
        super(message,cause);
    }
}
