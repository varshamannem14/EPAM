package com.epam.jml0;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(int employeeId, String name, String department, double hourlyRate,int hoursWorked){
        super(employeeId,name,department);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate){
        if(hourlyRate>0){
            this.hourlyRate=hourlyRate;
        }
        else{
            throw new IllegalArgumentException("Hourly rate cannot be negative");
        }
    }


    public void setHoursWorked(int hoursWorked){
        if(hoursWorked>0){
            this.hoursWorked=hoursWorked;
        }

        if(hoursWorked>1000){
            throw new IllegalArgumentException("Hours Worked is unrealistically high");
        }
        if(hoursWorked<=0){
            throw new IllegalArgumentException("Hours Worked cannot be negative or zero");
        }
    }



    @Override
    public void display(){
        super.display();
    }

    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }

    public void displaySalaryDetails(){
        System.out.println("Salary Details");
        System.out.println("Salary Details are confidential");
    }

}

