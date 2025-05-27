package com.epam.jml1;

public final class FullTimeEmployee extends Employee {

    private double bonus;

    public FullTimeEmployee(String name, double baseSalary, String department,String role,double bonus){
        super(name,baseSalary,department,role);
        this.bonus=bonus;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if(bonus<=0){
            throw new IllegalArgumentException("Bonus cannot be negative and zero");
        }
        else if(bonus>100000){
            throw new IllegalArgumentException("Bonus cannot be unrealistically high");
        }
        else {
            this.bonus = bonus;
        }
    }

    @Override
    public double calculateBonus() {
        return (getBaseSalary() * 0.2) + bonus;
    }
}
