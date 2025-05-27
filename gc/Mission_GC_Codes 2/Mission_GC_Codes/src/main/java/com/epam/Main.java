package com.epam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SuperClass {
    static void display() {
        System.out.println("Static method in SuperClass");
    }
}

class SubClass extends SuperClass {
    static void display() {
        System.out.println("Static method in SubClass");
    }
}

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SuperClass subClassRef = new SubClass();

        // Calling using the class reference
        SuperClass.display();   // Output: Static method in SuperClass
        SubClass.display();     // Output: Static method in SubClass

        // Calling using the object references
        superClass.display();   // Output: Static method in SuperClass
        subClassRef.display();  // Output: Static method in SuperClass

     Stream.iterate(1,n->n+2).limit(10).forEach(System.out::println);
     //fibancci series
        List<Integer> l=Stream.iterate(new int[]{0,1}, f->new int[]{f[1],f[0]+f[1]}).limit(10)
                         .map(f->f[0]).collect(Collectors.toList());
        System.out.println(l);
        //Print duplicate characters in a string?
        String s="aabdchs";
        Set<String> set=new HashSet<>();
        String join= Arrays.stream(s.split("")).filter(x->set.add(x)).collect(Collectors.joining());
        System.out.println(join);



    }
}
