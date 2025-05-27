package com.epam.jml2;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {


    private String name;
    private String department;
    private String role;
    private double baseSalary;
    private double bonus;
    private final List<SalaryObserver> observers = new ArrayList<>();

    public abstract String getEmployeeDetails();
    public abstract double calculateSalary();

    public Employee(String department, String name, String role, double baseSalary,double bonus) {
        this.department = department;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.bonus=bonus;
    }

    public void addObserver(SalaryObserver observer){
        observers.add(observer);
    }

    public void removeObserver(SalaryObserver observer){
        observers.add(observer);
    }

    public void notifyObservers() {
        for (SalaryObserver observer : observers) {
            observer.updateSalary(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            throw new IllegalArgumentException("Employee name cannot be null");
        }
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department==null){
            throw new IllegalArgumentException("Employee department cannot be null");
        }
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if(role==null){
            throw new IllegalArgumentException("Employee role cannot be null");
        }
        this.role = role;
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
        notifyObservers();
        this.baseSalary = baseSalary;
    }

    public double getBonus() {

        return bonus;
    }

    public void setBonus(double bonus) {
        if(bonus<=0){
            throw new IllegalArgumentException("Base Salary cannot be negative or zero");
        }
        else if(bonus>10_00_000){
            throw new IllegalArgumentException("Base Salary cannot be unrealistically high");
        }

        else this.bonus = bonus;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", baseSalary=" + baseSalary +
                ", bonus=" + bonus+
                '}';
    }
}
