package com.epam.singleton_class;

public class App {

    public static void main(String[] args) {

        LoggerSingleton singletonObj = LoggerSingleton.getInstance();

        System.out.println(singletonObj);

        LoggerSingleton singletonObj2 = LoggerSingleton.getInstance();

        System.out.println(singletonObj2);
    }

}
