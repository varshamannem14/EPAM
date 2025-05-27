package com.epam.jml0;

import java.util.HashSet;

public class EmployeeRecordsHashSet {
    private final HashSet<String> employeeRecords;

    public EmployeeRecordsHashSet(){
        employeeRecords = new HashSet<>();

    }

    public void addRecord(String record){
        if(record==null){
            throw new IllegalArgumentException("Record cannot be null");
        }

        if (employeeRecords.contains(record)) {
            System.out.println("Record already exists in the set.");
        } else {
            employeeRecords.add(record);
        }
    }

    public void display(){
        if(employeeRecords.isEmpty()){
            throw new IllegalArgumentException("Employee records is empty to display, add records inorder to display first");
        }
        for(String str : employeeRecords){
            System.out.println(str);
        }
    }
}
