package com.epam.service;

import com.epam.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    void createEmployee(Employee employee);
    Employee getEmployee(int id);
    List<Employee> getEmployeeList();
    void updateEmployee(int id,Employee employee);
    void deleteEmployee(int id);
    double calculatePayroll(int id);
    double calculateTotalPayroll();
    List<Employee> filterEmployeesByDepartment(String department);


}
