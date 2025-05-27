package com.epam.jml0;

public class PermanentEmployee extends EmploymentType implements Payable{
    private double monthlyPay;

    public PermanentEmployee(String employeeName, double monthlyPay){
        super(employeeName);
        this.monthlyPay=monthlyPay;
    }

    public double getMonthlyPay(){
        return monthlyPay;
    }

    public void setMonthlyPay(double monthlyPay){
        if(monthlyPay<=0){
            throw new IllegalArgumentException("Monthly payment cannot be negative or zero");
        }

        if(monthlyPay>10_00_000){
            throw new IllegalArgumentException("Monthly payment cannot be unrealistically high");
        }

        this.monthlyPay=monthlyPay;
    }
    @Override
    public int calculateWorkHours(){
        return 180;
    }
    @Override
    public double calculatePay(){
        return monthlyPay;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Monthly payment:"+calculatePay());
    }


}
