package com.epam.jml0;

public class PayrollSystem
{
    @PayrollAdjustment(adjustmentType = "Tax",adjustmentRate = 0.2)
    public double calculateTax(double salary){
        return salary - (salary*0.2);
    }

    @PayrollAdjustment(adjustmentType = "Overtime",adjustmentRate = 1.5)
    public double calculateOverTime(double baseSalary, int overTimeHours){
        return baseSalary + overTimeHours*1.5*baseSalary;
    }


}
