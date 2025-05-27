package com.epam.jml0;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFiltering {
    public static Comparator<Employee> byDepartment = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getDepartment().compareTo(o2.getDepartment());
        }
    };

    public static Comparator<Employee> bySalary = Comparator.comparing(Employee ::calculateSalary);
    public static List<Employee> searchByDepartment(List<Employee> employs, String department){
        return employs.stream()
                .filter(e->e.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    public static Employee searchByName(List<Employee> employs, String name){
        return employs.stream().
                filter(e->e.getName().equalsIgnoreCase(name)).
                findFirst()
                .orElse(null);
    }
}
