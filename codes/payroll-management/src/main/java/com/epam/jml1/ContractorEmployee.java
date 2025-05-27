package com.epam.jml1;

public final class ContractorEmployee extends Employee {

    private int workHours;
    public ContractorEmployee(String name, double baseSalary, String department,String role,int workHours){
        super(name, baseSalary, department, role);
        this.workHours=workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        if(workHours<=0){
            throw new IllegalArgumentException("Work hours cannot be negative or zero");
        }
        else if(workHours>1000){
            throw new IllegalArgumentException("Work hours cannot be exceptionally high");
        }
        else {
            this.workHours = workHours;
        }
    }

    @Override
    public double calculateBonus() {
        return workHours*100;
    }
}
