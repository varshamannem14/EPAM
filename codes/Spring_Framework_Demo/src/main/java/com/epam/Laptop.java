package com.epam;

public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop");
    }

    public void compile(){
        System.out.println("Compiling in Laptop");
    }
}
