package com.epam.jml1;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) {

        EmployeeRecord employee1 = new EmployeeRecord("Anand",10000);
        EmployeeRecord employee2 = new EmployeeRecord("Bob",200000);
        EmployeeRecord employee3 = new EmployeeRecord("Carol",30000);

        List<EmployeeRecord> employeeRecordList = new ArrayList<>();

        employeeRecordList.add(employee1);
        employeeRecordList.add(employee2);
        employeeRecordList.add(employee3);

        if(!employeeRecordList.isEmpty()){
            employeeRecordList.forEach(System.out::println);

        }
        else{
            System.out.println("Employee List is empty");
        }



        /*

        Employee employee1 = new Employee("Adam",10000.0,"Accounts","HR");
        Employee employee2 = new Employee("Bob",20000.0,"Finance","Manager");
        Employee employee3 = new Employee("Carol",16000.0,"Development","HR");
        Employee employee4 = new Employee("Dev",20000.0,"Finance","Manager");
        Employee employee5 = new Employee("Carol",16000.0,"Development","HR");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);


        Set<String> employeeSet = new HashSet<>();

        if(!employeeList.isEmpty()){
            employeeSet = employeeList.stream().filter(Objects::nonNull).map(Employee::getName).collect(Collectors.toSet());

            employeeSet.forEach(System.out::println);
        }

        else{
            System.out.println("Employee List is empty to convert into list");
        }
        /*

        List<Double> uniqueSalaries = new ArrayList<>();

        if(!employeeList.isEmpty()){

            uniqueSalaries = employeeList.stream().map(Employee::getBaseSalary).distinct().toList();

            uniqueSalaries.forEach(System.out::println);
        }
        else{
            System.out.println("List is empty to find unique salaries");
        }

        /*
        long employeeCount = 0;

        if(!employeeList.isEmpty()) {
            employeeCount = employeeList.stream().filter(employee -> employee.getBaseSalary() > 15000).count();
            System.out.println("Employee passing the criteria are "+ employeeCount);
        }
        else{
            System.out.println("Employee List is empty to count");
        }
        /*

        Optional<Employee> employee = employeeList.stream().filter(e->e.getBaseSalary()>15000).findFirst();

        if(employee.isEmpty()){
            System.out.println("No employee meets the criteria");
        }
        else {

            System.out.println(employee);
        }

        /*


        List<Employee> sortedEmployee = new ArrayList<>();

        if(!employeeList.isEmpty()){
            sortedEmployee = employeeList.stream().sorted(Comparator.comparing(Employee::getBaseSalary).reversed()).toList();
            sortedEmployee.forEach(System.out::println);

        }
        else{
            System.out.println("List is empty to sort");
        }

        /*

        Map<String,List<Employee>> groupByDepartment= new HashMap<>();

        if(!employeeList.isEmpty()){
            groupByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

            for(String k : groupByDepartment.keySet()){
                System.out.println(k+" : " + groupByDepartment.get(k));
            }
        }
        else{
            System.out.println("List is empty to group by department");
        }





        /*
        double sumOfSalaries = 0;

        if(!employeeList.isEmpty()){
            sumOfSalaries = employeeList.stream().map(Employee::getBaseSalary).reduce(0.0,Double::sum);
            System.out.println("Sum of employees salaries : "+ sumOfSalaries);
        }
        else{
            System.out.println("List is empty to calculate sum of salaries");
        }

        /*

        List<String> mappedNames = new ArrayList<>();

        if(!employeeList.isEmpty()){
            mappedNames = employeeList.stream().map(Employee::getName).toList();
        }
        else{

        }

        /*

        List<Employee> filteredEmployees = new ArrayList<>();

        filteredEmployees = employeeList.stream().filter(e->e.getRole().equals("HR")).toList();

        filteredEmployees = filteredEmployees.stream().filter(e->e.getBaseSalary()>10000).toList();

        filteredEmployees.forEach(System.out::println);

        /*

        List<Double> employeeListAnnualSalaries = new ArrayList<>();


        if(!employeeList.isEmpty()){

            employeeListAnnualSalaries = employeeList.stream().map(e->e.getBaseSalary()*12).toList();

        }

        else{
            throw new IllegalArgumentException("List is empty");
        }

        /*

        if(!employeeList.isEmpty()) {

            employeeList.sort((e1, e2) -> (int) (e1.getBaseSalary() - e2.getBaseSalary()));

            for (Employee e : employeeList) {
                System.out.println(e.getName() + "-" + e.getBaseSalary());
            }
        }
        else{
            throw new IllegalArgumentException("List is empty to sort");
        }


        /*
        BonusCalculator bonusCalculator = (baseSalary,rating)->{
            if(rating>=4.5){
                return baseSalary*0.2;
            }
            else if(rating>=3.0){
                return baseSalary*0.1;
            }
            else{
                return baseSalary*0.01;
            }
        };

        CalculateBonus calculateBonus = new CalculateBonus();

        double baseSalary = 10_000;
        double rating = 4.0;

        double totalSalary = calculateBonus.calculate(bonusCalculator,baseSalary,rating);

        System.out.println("Total Salary including bonus will be "+ totalSalary);



        /*
        SalaryCalculator salaryCalculator = baseSalary -> baseSalary-baseSalary*0.2;

        try{
            double salary = calculation(salaryCalculator,10_000.0);
            System.out.println("Salary is "+salary);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



        /*
        VariableSalaryCalculator salaryCalculator = (baseSalary, percentage) -> baseSalary + (baseSalary*(percentage/100));

        Employee regularEmployee = new Employee("Anand",10_000.0);
        Employee commissionEmployee = new Employee("Bob",10_000.0);

        double regularSalary = salaryCalculator.calculate(regularEmployee.getBaseSalary(),10.0);
        double commissionSalary = salaryCalculator.calculate(commissionEmployee.getBaseSalary(),20.0);



        System.out.println("Salary for regular Employee "+regularSalary);
        System.out.println("Salary for commission Employee "+commissionSalary);


        /*

        //Predicate and filter

        Employee employee1 = new Employee("Adam",10000.0);
        Employee employee2 = new Employee("Bob",20000.0);
        Employee employee3 = new Employee("Carol",16000.0);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Predicate<Employee> filterSalary = e->e.getBaseSalary()>15_000.0;

        List<Employee> filteredEmployeeList = employeeList.stream()
                .filter(filterSalary)
                .toList();

        filteredEmployeeList.forEach(e-> System.out.println("Salary of "+e.getName() +"is "+ e.getBaseSalary()));

/*
        double fixedBonus = 1000.0;

        SalaryCalculator salaryCalculator = salary->salary-salary*0.2;
        BonusCalculator bonusCalculator = (salary -> salary+fixedBonus);


        double baseSalary = 20000.0;
        double totalSalary = calculateTotalSalary(salaryCalculator,bonusCalculator,fixedBonus,baseSalary);


        System.out.println("Total salary with bonus is "+ totalSalary);

 */



    }

    /*
    // chained functional interface
    public static double calculateTotalSalary(SalaryCalculator salaryCalculator,BonusCalculator bonusCalculator,double fixedBonus,double baseSalary){

        if(baseSalary<=0){
            throw new IllegalArgumentException("Base Salary cannot be negative or zero");
        }
        else if(baseSalary>10_00_000){
            throw new IllegalArgumentException("Base Salary cannot be unrealistically high");
        }
        double salary = salaryCalculator.calculateSalary(baseSalary);

        double bonus = bonusCalculator.calculateBonus(baseSalary);

        return salary+(bonus-baseSalary);


    }

     */

    /*
    public static double calculation(SalaryCalculator salaryCalculator,double baseSalary){

        if(baseSalary<=0){
            throw new IllegalArgumentException("Base Salary cannot be negative or zero");
        }

        else if(baseSalary>10_00_000){
            throw new IllegalArgumentException("Base Salary is unexceptionally high");
        }

        return salaryCalculator.calculateSalary(baseSalary);
    }

     */


}
