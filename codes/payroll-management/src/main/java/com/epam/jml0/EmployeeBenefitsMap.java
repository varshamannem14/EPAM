package com.epam.jml0;
import java.util.HashMap;

public class EmployeeBenefitsMap {
    private final HashMap<Integer,String> employeeBenefits;
    public EmployeeBenefitsMap(){
        employeeBenefits = new HashMap<>();
   }

   public void addBenefit(Integer employeeId,String benefit){
        if(employeeId<=0 || benefit ==null){
            throw new IllegalArgumentException("employeeId cannot be zero or negative nor benefit can be null");
        }
        employeeBenefits.put(employeeId,benefit);
   }
   public void display(){
       System.out.println("Employee Benefits:");
       if(employeeBenefits.isEmpty()){
           throw new IllegalArgumentException("Map is empty to display details");
       }
       for(Integer i : employeeBenefits.keySet()){
           System.out.println(i+":"+employeeBenefits.get(i));
       }
   }
}
