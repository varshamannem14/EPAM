package com.epam.jml1;

public class CalculateBonus {

    public double calculate(BonusCalculator bonusCalculator,double baseSalary,double rating){
        if(baseSalary<=0){
            throw new IllegalArgumentException("Base Salary cannot be negative or zero");
        }
        else if(baseSalary>10_00_000.0){
            throw new IllegalArgumentException("Base salary cannot be exceptionally high");
        }

        return bonusCalculator.calculateBonus(baseSalary,rating);
    }
}
