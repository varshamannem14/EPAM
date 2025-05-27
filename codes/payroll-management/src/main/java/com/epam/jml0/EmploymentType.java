package com.epam.jml0;

abstract public class EmploymentType {
    private String employeeName;
    public abstract int calculateWorkHours();

    public EmploymentType(String employeeName){
        this.employeeName=employeeName;
    }
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        if(employeeName !=null){
            this.employeeName=employeeName;
        }
        else{
            throw new IllegalArgumentException("Employee name cannot be null");
        }
    }

    public void display(){
        System.out.println("Employee Name:"+employeeName);
    }

}
