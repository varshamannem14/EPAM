package com.epam.jml1;

public class RegularSalaryCalculator implements SalaryCalculator{

    private double baseSalary;

    public RegularSalaryCalculator(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<=0){
            throw new IllegalArgumentException("Base Salary cannot be negative or zero");
        }

        else if(baseSalary>10_00_000){
            throw new IllegalArgumentException("Base Salary cannot be unrealistically high");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary(double baseSalary) {
        if(baseSalary<=0){
            throw new IllegalArgumentException("Base Salary cannot be negative or zero");
        }
        return baseSalary - baseSalary*0.2;
    }
}
