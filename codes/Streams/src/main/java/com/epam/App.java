package com.epam;

import java.util.*;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandrum", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

        //Question 1: Grouping Employees by City

        Map<String,List<Employee>> groupByCity = new HashMap<>();
        groupByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));

        for(String k : groupByCity.keySet()){
            System.out.println(k +" : " + groupByCity.get(k));
        }

        //Question 2: Grouping Employees by Age

        Map<Integer,List<Employee>> groupByAge = new HashMap<>();
        //groupByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));

        groupByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));

        for(int k : groupByAge.keySet()){
            System.out.println(k + " : " +groupByAge.get(k));
        }

        //Question 3: Finding the Count of Male and Female Employees

        Map<String,Long> countByGender = new HashMap<>();

        countByGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));





        //countByGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        for(String k : countByGender.keySet()){
            System.out.println(k+" : "+ countByGender.get(k));
        }

        //Question 4: Printing Names of All Departments

        List<String> departments = new ArrayList<>();

        departments = empList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());










        //departments = empList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());

        departments.forEach(System.out::println);

        //Question 5: Printing Employee Details by Age Criteria
        //Print employee details whose age is greater than 28

        List<Employee> filterByAge = new ArrayList<>();






        filterByAge = empList.stream().filter(e->e.getAge()>28).collect(Collectors.toList());

        //
        //
        //
        //
        //
        //
        // filterByAge = empList.stream().filter(e->e.getAge()>28).collect(Collectors.toList());

        filterByAge.forEach(System.out::println);


        //Question 6: Finding Maximum Age of Employee

        OptionalInt maxAge = empList.stream().mapToInt(Employee::getAge).max();
        if(maxAge.isPresent()){
            System.out.println(maxAge.getAsInt());
        }

        //Question 7: Printing Average Age of Male and Female Employees

        Map<String,Double> averageAge = new HashMap<>();

        averageAge = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));

        for(String k : averageAge.keySet()){
            System.out.println(k+" : "+averageAge.get(k));
        }

        //Question 8: Printing the Number of Employees in Each Department

        Map<String,Long> countByDepartment = new HashMap<>();

        countByDepartment = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));

        for(String k: countByDepartment.keySet()){
            System.out.println(k+" : "+ countByDepartment.get(k));
        }

        //Question 9: Finding the Oldest Employee

        Optional<Employee> oldestEmployee = empList.stream().max(Comparator.comparing(Employee::getAge));

        if(oldestEmployee.isPresent()){
            System.out.println(oldestEmployee.get());
        }

        //Question 10: Finding the Youngest Female Employee

        Optional<Employee> youngestFemaleEmployee = empList.stream().filter(e->e.getGender().equals("F")).min(Comparator.comparing(Employee::getAge));

        if(youngestFemaleEmployee.isPresent()){
            System.out.println(youngestFemaleEmployee.get());
        }

        //Question 11: Finding Employees by Age Range
        //Find employees whose age is greater than 30 and less than 30

        Map<Boolean,List<Employee>> partitioningByAge = new HashMap<>();

        partitioningByAge = empList.stream().collect(Collectors.partitioningBy(e->e.getAge()>30));

        for(boolean k : partitioningByAge.keySet()){
            System.out.println(k+" : "+partitioningByAge.get(k));
        }

        //Question 12: Finding Department with Highest Number of Employees

        Map.Entry<String,Long> departmentWithMaxEmployees = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println(departmentWithMaxEmployees);

        //Question 13: Finding Employees from HR Department

        Optional<Employee> hrEmployees = empList.stream().filter(e->e.getDeptName().equalsIgnoreCase("HR")).findAny();

        if(hrEmployees.isPresent()){
            System.out.println(hrEmployees.get());
        }

        //Question 14: Finding Departments with Over 3 Employees

        Map<String,Long> deptOverThreeEmploys = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>3)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        deptOverThreeEmploys.forEach((k,v)-> System.out.println(k+" : "+v));

        //Question 15: Finding Distinct Department Names

        List<String> distinctDepartments = empList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());

        distinctDepartments.forEach(System.out::println);

        //Question 16: Finding and Sorting Employees by City

        List<Employee> sortedEmployeeByCity = new ArrayList<>();

        sortedEmployeeByCity = empList.stream().sorted(Comparator.comparing(Employee::getCity)).collect(Collectors.toList());

        sortedEmployeeByCity.forEach(System.out::println);

        List<Employee> filterByCitySortByNames = new ArrayList<>();

        filterByCitySortByNames = empList.stream().filter(e->e.getCity().equalsIgnoreCase("blore")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

        filterByCitySortByNames.forEach(System.out::println);

        //Question 17: Counting the Number of Employees in the Organization

        Long count = empList.stream().count();

        System.out.println(count);

        //Question 20: Sorting Employees by Name and Age

        List<Employee> sortByNameThenAge = new ArrayList<>();

        sortByNameThenAge = empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).collect(Collectors.toList());

        sortByNameThenAge.forEach(System.out::println);

        //Question 21: Finding the Highest Experienced Employee

        Optional<Employee> seniorEmployee = empList.stream().min(Comparator.comparing(Employee::getYearOfJoining));

        if(seniorEmployee.isPresent()){
            System.out.println(seniorEmployee.get());
        }

        seniorEmployee = empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
        if (seniorEmployee.isPresent()){
            System.out.println(seniorEmployee.get());
        }

        //Question 22: Printing Average and Total Salary of the Organization

        DoubleSummaryStatistics empSalary = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary in the organisation = " + empSalary.getAverage());

        System.out.println("Total Salary in the organisation = " + empSalary.getSum());

        //Question 23: Printing Average Salary of Each Department

        Map<String, Double> avgSalaryByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSalary)));

        avgSalaryByDept.forEach((k,v)-> System.out.println(k+" : "+v));

        //Question 24: Finding the Highest Salary in the Organization

        Optional<Employee> highestSalaryEmployee = empList.stream().max(Comparator.comparing(Employee::getSalary));

        System.out.println(highestSalaryEmployee.get());

        //Question 25: Finding the Second-Highest Salary in the Organization

        Optional<Employee> secondHighestSalary = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();

        System.out.println(secondHighestSalary.get());

        //nth highest salary --> skip(n-1) findFirst()

        //Question 27: Finding the Highest Paid Salary in the Organization Based on Gender

        Map<String,Optional<Employee>> highestPaidByGender = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        highestPaidByGender.forEach((k,v)-> System.out.println(k+" : "+v));




    }
}
