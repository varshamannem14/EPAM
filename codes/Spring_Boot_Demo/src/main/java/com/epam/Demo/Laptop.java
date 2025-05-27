package com.epam.Demo;


import org.springframework.stereotype.Component;

@Component  // conveys Spring to create and handle the object of these class
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiling!!");
    }
}
