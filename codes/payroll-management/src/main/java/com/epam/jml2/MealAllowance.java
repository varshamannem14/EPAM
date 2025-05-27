package com.epam.jml2;

public class MealAllowance extends SalaryDecorator{
    private double mealAllowance;
    public MealAllowance(Employee employee,double mealAllowance) {
        super(employee);
        this.mealAllowance=mealAllowance;
    }

    @Override
    public String getEmployeeDetails(){
        return super.getEmployeeDetails()+" Meal Allowance :"+ mealAllowance;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary()+mealAllowance;
    }
}
