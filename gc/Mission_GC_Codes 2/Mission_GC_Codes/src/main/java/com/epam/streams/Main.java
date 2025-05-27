//package com.epam.streams;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Employee implements Comparable<Employee>{
//    private int age;
//    private String name;
//
//    Employee(int age,String name)
//    {
//        this.age = age;
//        this.name = name;
//    }
//    public int getAge(int age)
//    {
//        return age;
//    }
//
//     public String getName() {
//         return name;
//     }
//     @Override
//     public int compareTo(Employee other)
//     {
//       if(this.age!= other.age)
//       {
//           return Integer.compare(this.age, other.age);
//       }
//       return this.name.compareTo(other.name);
//     }
//
//     @Override
//     public String toString() {
//         return "Employee{" +
//                 "age=" + age +
//                 ", name='" + name + '\'' +
//                 '}';
//     }
// }
//
//public class Main {
//    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(20,"Roopini"));
//        employees.add(new Employee(21,"Yashu"));
//        employees.add(new Employee(20,"Varsha"));
//
//
//        Collections.sort(employees);
//
//        for(Employee employee : employees)
//        {
//            System.out.println(employee);
//        }
//
//
//
//    }
//}
