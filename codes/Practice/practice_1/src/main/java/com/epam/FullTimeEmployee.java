package com.epam;

public class FullTimeEmployee extends Employee{

    private double baseSalary;

    public FullTimeEmployee(String name,int id,double baseSalary){
        super(name,id);
        this.baseSalary=baseSalary;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    public

    @Override
    public double calculateSalary(){
        return baseSalary - baseSalary*0.2;
    }
}
