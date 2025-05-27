package com.epam.jml2;

public class App {
    public static void main(String[] args) {

        SalaryObserver hrDepartment = new HRDepartment();
        SalaryObserver financeDepartment = new FinanceDepartment();

        Employee employee = new FullTimeEmployee("Development","Alice","Manager",10000,500,1000);

        System.out.println(employee.calculateSalary());


        employee.addObserver(hrDepartment);
        employee.addObserver(financeDepartment);

        employee.setBaseSalary(15000);
        employee.setBonus(1000);

        System.out.println(employee.calculateSalary());




    }
}

/*
        Employee employee1 = new FullTimeEmployee("Accounts","Alice","Manager",1000,100,100);

        employee1.getEmployeeDetails();
        System.out.println(employee1.calculateSalary());

        employee1 = new HealthAllowance(employee1,10000);

        employee1.getEmployeeDetails();
        System.out.println(employee1.calculateSalary());




        Employee employee1 = EmployeeFactory.createEmployee("fulltime","Accounts","Alice","Manager",1000,100);
        Employee employee2 = EmployeeFactory.createEmployee("contract","Engineering","Bob","HR",1000,100);

        System.out.println(employee1.calculateSalary());
        System.out.println(employee2.calculateSalary());

 */
