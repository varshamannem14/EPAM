package com.epam.jml2;

public class FinanceDepartment implements SalaryObserver{
    @Override
    public void updateSalary(Employee employee) {
        System.out.println("Finance Notification: Salary processed for " + employee.getName() +
                ". Updated Salary: $" + employee.calculateSalary());
    }
}
