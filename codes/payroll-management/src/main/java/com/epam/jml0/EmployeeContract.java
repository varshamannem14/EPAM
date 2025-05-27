package com.epam.jml0;

public abstract class EmployeeContract {
    private int employeeId;
    private String department;
    private String name;

    public abstract void defineWorkHours();
    public abstract void assignProject();

    public EmployeeContract(int employeeId,String name,String department){
        this.employeeId=employeeId;
        this.name=name;
        this.department=department;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getDepartment(){
        return department;
    }

    public String getName(){
        return name;
    }

    public void setEmployeeId(int employeeId){
        if(employeeId>0){
            this.employeeId=employeeId;
        }
        else{
            throw new IllegalArgumentException("Employee Id cannot be negative");
        }
    }

    public void setDepartment(String department){
        if(department!=null && !department.trim().isEmpty()){
            this.department=department;
        }
        else {
            throw new IllegalArgumentException("Department cannot be null");
        }
    }

    public void setName(String name){
        if(name!=null && !name.trim().isEmpty()){
            this.name=name;
        }
        else{
            throw new IllegalArgumentException("Name cannot be null");
        }
    }

    public void display(){
        System.out.println("Employee ID:"+ employeeId);
        System.out.println("Department:"+department);
        System.out.println("Employee Name:"+name);
    }
}
