package com.epam.service;

import com.epam.EmployeeNotFoundException;
import com.epam.model.Employee;
import com.epam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;




@Service
public class EmployeeServiceImplementation implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public void createEmployee(Employee employee) {

        employeeRepo.save(employee);

    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = employeeRepo.findById(id).orElse(null);
        return employee;
    }

    @Override
    public List<Employee> getEmployeeList() {
        List<Employee> employees = employeeRepo.findAll();
        return employees;
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public double calculatePayroll(int id){
        Employee employee = employeeRepo.findById(id).orElseThrow(() -> {
            return new EmployeeNotFoundException("Employee with ID " + id + " not found");
        });

        double baseSalary = employee.getBaseSalary();
        double bonus = switch (employee.getDepartment().toLowerCase()) {
            case "engineering" -> baseSalary * 0.20;
            case "hr" -> baseSalary * 0.10;
            case "sales" -> baseSalary * 0.30;
            default -> baseSalary * 0.05;
        };

        double totalSalary = baseSalary + bonus;
        return totalSalary;
    }

    @Override
    public double calculateTotalPayroll(){
        double totalPayroll = employeeRepo.findAll().stream().mapToDouble(employee -> {
            double baseSalary = employee.getBaseSalary();
            double bonus = switch (employee.getDepartment().toLowerCase()) {
                case "engineering" -> baseSalary * 0.20;
                case "hr" -> baseSalary * 0.10;
                case "sales" -> baseSalary * 0.30;
                default -> baseSalary * 0.05;
            };
            return baseSalary + bonus;
        }).sum();
        return totalPayroll;
    }

    @Override
    public List<Employee> filterEmployeesByDepartment(String department){

        return employeeRepo.findAll().stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }


}
