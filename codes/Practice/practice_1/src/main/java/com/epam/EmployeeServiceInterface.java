package com.epam;

public interface EmployeeServiceInterface {

    void createEmployee(Employee employee);
    List<Employee> getEmployees();
    void getEmployeeById();

}
