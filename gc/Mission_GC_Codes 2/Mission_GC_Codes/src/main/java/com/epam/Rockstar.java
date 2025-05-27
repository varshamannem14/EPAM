package com.epam;

public class Rockstar {
    String name = "Roopini";
    int a;
    int b;
    Rockstar(int a,int b)
    {
        System.out.println(a);
        System.out.println(b);
    }
    void display() {
        System.out.println("Super class");
    }

}
 class Child extends Rockstar{
    Child()
    {
        super(1,2);
        System.out.println("I am child");
    }
    void display()
    {
        super.display();
        System.out.println("Child class");
    }
    String name = "Neha";
    void printName()
    {
        System.out.println(super.name);
        System.out.println(name);
    }

//    int rollno;
//    String name;
//    int age;
//    Rockstar(int rollno,String name)
//    {
//        this.rollno=rollno;
//        this.name = name;
//    }
//    Rockstar(int rollno,String name,int age)
//    {
//        this(rollno,name);
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Rockstar{" +
//                "rollno=" + rollno +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.printName();

    }
}
