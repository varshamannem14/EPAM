package com.epam.jml2;

public class SalaryCalculator {

    private BaseSalaryCalculator salaryStrategy;

    public SalaryCalculator(BaseSalaryCalculator salaryStrategy){
        this.salaryStrategy = salaryStrategy;
    }

    public double calculate(Employee employee){
        if(employee==null){
            throw new IllegalArgumentException("Employee input is null");
        }
        else if(employee.getBaseSalary()<0){
            throw new IllegalArgumentException("Employee base salary is negative to calculate total salary");
        }
        else if(employee.getBonus()<=0){
            throw new IllegalArgumentException("Bonus cannot be zero or negative");
        }
        //return salaryStrategy.calculateSalary(employee);
        return 0;
    }

}
