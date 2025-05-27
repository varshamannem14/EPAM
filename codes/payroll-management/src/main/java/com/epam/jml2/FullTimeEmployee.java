package com.epam.jml2;

public class FullTimeEmployee extends Employee implements BaseSalaryCalculator,BonusCalculator {

    private double hike;

    public FullTimeEmployee(String department, String name, String role, double baseSalary, double bonus, double hike) {
        super(department, name, role, baseSalary, bonus);
        this.hike = hike;
    }

    public double getHike() {
        return hike;
    }

    public void setHike(double hike) {
        if (hike <= 0) {
            throw new IllegalArgumentException("Hike cannot be negative or zero");
        }
        this.hike = hike;
    }

    @Override
    public String getEmployeeDetails() {
        return super.toString()+"Hike :"+hike;
    }



    @Override
    public double calculateBaseSalary(){

        if(getBaseSalary()<0){
            throw new IllegalArgumentException("Employee base salary is negative to calculate total salary");
        }

        return getBaseSalary() - getBaseSalary()*0.2;

    }

    @Override
    public double calculateBonus(){
        if(getBonus()<0){
            throw new IllegalArgumentException("Employee bonus is negative to calculate total salary");
        }
        return hike+getBonus();
    }

    @Override
    public double calculateSalary(){
        return calculateBaseSalary()+calculateBonus();
    }

}
