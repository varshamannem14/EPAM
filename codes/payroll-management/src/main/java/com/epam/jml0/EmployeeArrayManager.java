package com.epam.jml0;

public class EmployeeArrayManager {
    private FullTimeEmployee[] employees;
    public int size;

    public EmployeeArrayManager(int capacity){
        employees = new FullTimeEmployee[capacity];
        size=0;
    }

    public void addEmployee(FullTimeEmployee employee){
        if(size==employees.length){
            FullTimeEmployee[] newEmployees = new FullTimeEmployee[employees.length*2];
            System.arraycopy(employees,0,newEmployees,0,employees.length);
            employees=newEmployees;
        }
        employees[size++]=employee;
    }

    public void removeEmployee(int index){
        if(index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }
        System.arraycopy(employees,index+1,employees,index,size-index-1);
        employees[--size]=null;
    }

    public void display(){
        for(FullTimeEmployee employee: employees){
            if(employee==null){
                System.out.println("Employee cannot be null");
            }
            else {
                employee.display();
            }
        }
    }

}
