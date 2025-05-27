package com.epam;

public abstract class Employee {

    private String name;
    private int id;

    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    public abstract double calculateSalary();

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String toString(){
        return "Employee Name:"+name+"\nEmployee Id:"+id;
    }
}
