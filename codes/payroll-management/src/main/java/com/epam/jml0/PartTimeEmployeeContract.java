package com.epam.jml0;

public class PartTimeEmployeeContract extends EmployeeContract{
    public PartTimeEmployeeContract(int employeeId, String department, String name){
        super(employeeId,department,name);
    }

    @Override
    public void defineWorkHours(){
        System.out.println("Part-time work: Flexible, 20 hours per week");
    }

    @Override
    public void assignProject(){
        System.out.println("Assigned to short time projects");
    }
}
