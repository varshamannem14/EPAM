package com.epam.jml0;

import java.util.ArrayList;

public class PayrollTasksList {
    private final ArrayList<String> tasks;

    public PayrollTasksList(){
        tasks = new ArrayList<>();
    }

    public void addTask(String task){
        if(task==null){
            throw new IllegalArgumentException("Task cannot be null");
        }
        tasks.add(task);
    }

    public void display(){
        if(tasks.isEmpty()){
            throw new IllegalArgumentException("Tasks list is empty to display, add some tasks to display");
        }
        for(String str : tasks){
            System.out.println(str);
        }
    }
}
