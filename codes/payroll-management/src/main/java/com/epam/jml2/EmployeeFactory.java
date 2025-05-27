package com.epam.jml2;

public class EmployeeFactory {

    public static Employee createEmployee(String type, String department, String name, String role, double baseSalary, double bonus) {
        return switch (type) {
            case ("fulltime") -> new FullTimeEmployee(department, name, role, baseSalary, bonus, 100);
            case ("contract") -> new ContractEmployee(department, name, role, baseSalary, bonus, 10, 100);
            default -> null;
        };
    }
}
