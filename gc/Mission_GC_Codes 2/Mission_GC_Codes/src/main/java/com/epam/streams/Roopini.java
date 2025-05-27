package com.epam.streams;
import java.util.*;


class Employee {
    private int age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}

    public class Roopini {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(30, "Alice"));
            employees.add(new Employee(25, "Bob"));
            employees.add(new Employee(30, "Charlie"));
            employees.add(new Employee(25, "David"));

            // Define the comparator
            Comparator<Employee> comparator = Comparator
                    .comparingInt(Employee::getAge)  // Compare by age first
                    .thenComparing(Employee::getName); // If age is same, compare by name

            // Sort using the custom comparator
            Collections.sort(employees, comparator);

            // Print the sorted list
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }


