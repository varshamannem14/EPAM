package com.epam.jml2;

public class SalaryDecorator extends Employee{

    private Employee decoratedEmployee;

    public SalaryDecorator(Employee employee){
        super(employee.getDepartment(), employee.getName(), employee.getRole(), employee.getBaseSalary(), employee.getBonus());
        this.decoratedEmployee=employee;
    }
    @Override
    public String getEmployeeDetails() {
        return decoratedEmployee.getEmployeeDetails();
    }

    @Override
    public double calculateSalary() {
        return decoratedEmployee.calculateSalary();
    }
}
