package org.example;

public class Main {
    public static void main(String[] args) {
      proto obj = new proto(20,"Roopini",2);
      proto cloneObj = (proto) obj.clone();
        System.out.println(cloneObj);
    }
}