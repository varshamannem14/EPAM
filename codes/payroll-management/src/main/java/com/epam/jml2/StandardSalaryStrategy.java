package com.epam.jml2;

public class StandardSalaryStrategy implements BaseSalaryCalculator {
    @Override
    public double calculateBaseSalary() {
        return 0;
    }

//    @Override
//    public double calculateSalary(Employee employee) {
//        return (employee.getBaseSalary() - employee.getBaseSalary() * 0.2)+ employee.getBonus();
//    }

}
