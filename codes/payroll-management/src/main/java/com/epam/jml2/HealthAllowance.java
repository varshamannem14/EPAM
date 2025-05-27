package com.epam.jml2;

public class HealthAllowance extends SalaryDecorator{
    private double healthAllowance;

    public HealthAllowance(Employee employee,double healthAllowance) {
        super(employee);
        this.healthAllowance=healthAllowance;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails()+" Helath Allowance :"+healthAllowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+healthAllowance;
    }



}
