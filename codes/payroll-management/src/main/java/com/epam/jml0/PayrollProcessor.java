package com.epam.jml0;

import java.lang.reflect.Method;

public class PayrollProcessor {
    public static void processPayroll(Object payrollSystem) throws Exception{
        Class<?> clazz = payrollSystem.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for(Method method : methods){
            if(method.isAnnotationPresent(PayrollAdjustment.class)){
                PayrollAdjustment annotation = method.getAnnotation(PayrollAdjustment.class);
                String adjustmentType = annotation.adjustmentType();
                double adjustmentRate = annotation.adjustmentRate();

                double salary = new FullTimeEmployee(101,"Anand","HR",10000.0,1000).calculateSalary();
                int overtimeHours = 15;

                System.out.println("Processing "+adjustmentType+" adjustment for method "+method.getName());
                if("Tax".equals(adjustmentType)){
                    double newSalary = (double) method.invoke(payrollSystem,salary);
                    System.out.println("Salary after tax adjustment " + newSalary);
                }
                else if("Overtime".equals(adjustmentType)){
                    double newSalary = (double) method.invoke(payrollSystem,salary,overtimeHours);
                    System.out.println("Salary after calculating overtime "+ newSalary);
                }
            }
        }
    }
}
