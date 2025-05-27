package com.epam.jml0;

public class Contractor extends EmploymentType implements Payable {
    private int hoursWorked;
    private double hourlyRate;

    public Contractor(String employeeName,int hoursWorked,double hourlyRate){
        super(employeeName);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked){
        if(hoursWorked>0){
            this.hoursWorked=hoursWorked;
        }
        else{
            throw new IllegalArgumentException("Hours worked cannot be negative or zero");
        }
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate){
        if(hourlyRate<=0){
            throw new IllegalArgumentException("Hourly rate cannot be negative or zero");
        }

        if(hourlyRate > 1_00_000){
            throw new IllegalArgumentException("Hourly rate cannot be unexceptionally high");
        }

        this.hourlyRate=hourlyRate;
    }
    @Override
    public int calculateWorkHours(){
        return hoursWorked;
    }
    @Override
    public double calculatePay(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Calculated pay based on hourly based payment:"+calculatePay());
    }
}
