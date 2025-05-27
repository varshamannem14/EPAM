package com.epam.jml0;

import java.util.Collection;

public class PayrollGenerics {

    public static <T extends Employee> void processPayroll(Collection<T> employs){
        for(T employ:employs){
            double salary = employ.calculateSalary();
            System.out.println("Salary Payroll for "+ employ.getName()+" " + salary);
            employ.display();

        }
    }


}
