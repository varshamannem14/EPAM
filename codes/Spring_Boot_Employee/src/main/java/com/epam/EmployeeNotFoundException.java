package com.epam;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(String msg){
        super(msg);
    }
}
