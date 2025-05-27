package com.epam.jml2;

public class ContractEmployee extends Employee implements BaseSalaryCalculator, WageCalculator{

    private int hoursWorked;
    private double hourlyPay;

    public ContractEmployee(String department, String name, String role, double baseSalary,double bonus,int hoursWorked,double hourlyPay){
        super(department, name, role, baseSalary, bonus);
        this.hoursWorked=hoursWorked;
        this.hourlyPay=hourlyPay;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if(hoursWorked<=0){
            throw new IllegalArgumentException("Hours Worked cannot be zero nor negative");
        }
        else if(hoursWorked>1000){
            throw new IllegalArgumentException("Hours worked are unexceptionally high");
        }
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        if(hourlyPay<=0){
            throw new IllegalArgumentException("Hourly pay cannot be negative nor zero");
        }

        else if(hourlyPay>10000){
            throw new IllegalArgumentException("Hourly pay is unexceptionally high");
        }
        this.hourlyPay = hourlyPay;
    }

    @Override
    public String getEmployeeDetails(){
        return (super.toString()+"Hours Worked :"+ hoursWorked + " HourlyPay :" + hourlyPay);
    }

    @Override
    public double calculateBaseSalary(){

        if(getBaseSalary()<0){
            throw new IllegalArgumentException("Employee base salary is negative to calculate total salary");
        }
        return getBaseSalary() - getBaseSalary()*0.2;

    }

    @Override
    public double calculateWage(){
        return hourlyPay*hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return calculateWage()+calculateBaseSalary();
    }
}
