package com.epam.jml1;

import java.util.Objects;

public sealed abstract class Employee permits FullTimeEmployee, ContractorEmployee {

    private String name;
    private double baseSalary;
    private String role;
    private String department;
    public abstract double calculateBonus();

    public Employee(String name, double baseSalary, String department,String role){
        this.name=name;
        this.baseSalary=baseSalary;
        this.department=department;
        this.role=role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name==null){
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        if(baseSalary <=0){
            throw new IllegalArgumentException("Base Salary cannot be negative or less than zero");
        }

        else if(baseSalary>10_00_000){
            throw new IllegalArgumentException("Base Salary cannot be unrealistically high");
        }
        this.baseSalary = baseSalary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if(role==null){
            throw new IllegalArgumentException("Role cannot be null");
        }
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department==null){
            throw new IllegalArgumentException("Department cannot be null");
        }
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{name='%s', baseSalary=%s, department='%s'}".formatted(name, baseSalary, department);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(baseSalary, employee.baseSalary) == 0
                && Objects.equals(name, employee.name)
                && Objects.equals(role, employee.role)
                && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, baseSalary, role, department);
    }
}
