package com.epam.jml2;

public class HRDepartment implements SalaryObserver {
    @Override
    public void updateSalary(Employee employee) {
        System.out.println("HR Notification: Salary updated for " + employee.getName() +
                ". New Salary: $" + employee.calculateSalary());
    }
}
