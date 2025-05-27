package com.epam.jml0;



public class FullTimeEmployee extends Employee{
    private double baseSalary;
    private double annualBonus;
    public FullTimeEmployee(int employeeId, String name, String department, double baseSalary, double annualBonus) {
        super(employeeId, name, department);
        this.baseSalary=baseSalary;
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setAnnualBonus(double annualBonus){
        if(annualBonus>0){
            this.annualBonus=annualBonus;
        }
        else{
            throw new IllegalArgumentException("Annual Bonus cannot be negative");
        }
    }

    public void setBaseSalary(double baseSalary) {

        if(baseSalary>1_000_000){
            throw new IllegalArgumentException("Base Salary cannot be unrealistically high");
        }

        if(baseSalary<=0){
            throw new IllegalArgumentException("Base Salary cannot be negative and zero");
        }

        this.baseSalary = baseSalary;



    }


    @Override
    public void display(){
        super.display();
    }

    @Override
    public double calculateSalary(){
        return baseSalary+annualBonus;
    }

    public double overTimePay(double hoursWorked,double baseSalary) throws PayrollException{

        try{
            if(hoursWorked<0){
                throw new PayrollException("Hours worked must be greater than 0");
            }
            return hoursWorked>40 ? (hoursWorked-40)*(baseSalary/2) :0;
        }
        catch (ArithmeticException e){
            throw new PayrollException("Error in calculating overtime",e);
        }

    }




}
