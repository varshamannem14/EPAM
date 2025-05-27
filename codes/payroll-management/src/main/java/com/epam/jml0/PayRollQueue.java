package com.epam.jml0;

import java.util.LinkedList;
import java.util.Queue;

public class PayRollQueue {
    private final Queue<String> payrollQueue;

    public PayRollQueue(){
        payrollQueue = new LinkedList<>();
    }

    public void addPayroll(String payroll){
        if(payroll == null){
            throw new IllegalArgumentException("Payroll cannot be null");
        }
        payrollQueue.add(payroll);
    }

    public void display(){
        if(payrollQueue.isEmpty()){
            throw new IllegalArgumentException("Queue is empty to display details");
        }
        while(!payrollQueue.isEmpty()){
            System.out.println(payrollQueue.poll());
        }
    }
}
