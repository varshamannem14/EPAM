package com.epam.jml0;

public class FullTimeEmployeeContract extends EmployeeContract{
    public FullTimeEmployeeContract(int employeeId,String department,String name){
        super(employeeId,department,name);
    }

    @Override
    public void defineWorkHours(){
        System.out.println("Full-time work hours : 40 hours per week");
    }

    @Override
    public void assignProject(){
        System.out.println("Assigned to long term projects with yearly goals");
    }
}
