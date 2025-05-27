package com.epam.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier ("laptop")
    private Computer comp; // field injection (using AutoWiring)


    /*
      //constructor injection
      public Dev(Laptop laptop){
            this.laptop=laptop;
        }


    //setter injection (uses AutoWired)
    @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }

     */

    public void build(){
        comp.compile();
        System.out.println("Working on project!!");
    }
}
