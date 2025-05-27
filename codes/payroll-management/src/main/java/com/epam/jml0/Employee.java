package com.epam.jml0;

abstract class Employee implements Comparable<Employee>{
    private int employeeId;
    private String name;
    private String department;

    public abstract double calculateSalary();


    public Employee(int employeeId, String name, String department){
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }


    public String getDepartment() {
        return department;
    }

    public String getName() {
            return name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


    public void setDepartment(String department) {
        if(department!=null) {
            this.department = department;
        }
        else{
            throw new IllegalArgumentException("Department cannot be null");
        }
    }

    public void setName(String name) {
        if(name!=null) {
           this.name = name;
        }
        else{
            throw new IllegalArgumentException("Employee name cannot be null");
        }
    }

    public void display(){
        System.out.println("Employee Id:" + employeeId);
        System.out.println("Employee name:"+ name);
        System.out.println("Employee department:"+department);
    }

    @Override
    public int compareTo(Employee other){
        return this.employeeId-other.employeeId;
    }



}


