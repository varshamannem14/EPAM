package com.epam;

public class Exceptions {
    public static void main(String[] args)throws ArithmeticException{
        try{
           int age=30;

           if(age>=18)
           {
              throw new ArithmeticException("Eligible to vote");
           }

        }

        finally {
            System.out.println("Exceuting finally block");
        }
    }
}
