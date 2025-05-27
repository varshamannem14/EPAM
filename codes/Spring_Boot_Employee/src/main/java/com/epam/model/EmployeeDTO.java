package com.epam.model;

import java.time.LocalDate;

public class EmployeeDTO {

    private int id;

    private String name;
    private String department;
    private double baseSalary;
    private String jobTitle;
    private LocalDate joiningDate;

    public EmployeeDTO(int id, String name, String department, double baseSalary,String jobTitle,LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
        this.jobTitle=jobTitle;
        this.joiningDate=joiningDate;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
