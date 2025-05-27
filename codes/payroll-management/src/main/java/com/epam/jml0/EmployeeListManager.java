package com.epam.jml0;

import java.util.ArrayList;

public class EmployeeListManager {
    public ArrayList<FullTimeEmployee> employees;

    public EmployeeListManager(){
        employees = new ArrayList<>();
    }

    public void addEmployee(FullTimeEmployee employee){
        employees.add(employee);
    }

    public void removeEmployee(int index){
        if(index<0 || index > employees.size()){
            throw new IndexOutOfBoundsException("Invalid index");
        }

        employees.remove(index);
    }

    public void display(){
        for(FullTimeEmployee employee: employees){
            if(employee==null){
                System.out.println("employee is null");
            }
            else {
                employee.display();
            }
        }
    }

}
