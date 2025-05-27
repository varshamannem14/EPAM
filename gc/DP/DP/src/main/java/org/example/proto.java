package org.example;

public class proto implements Prototype{
    public int age;
    private String name;
    public int id;
   proto(){

   }
    proto(int age,String name,int id)
    {
        this.age=age;
        this.name=name;
        this.id=id;

    }
    @Override
    public Prototype clone()
    {
        return new proto(age,name,id);
    }
    @Override
    public String toString()
    {
        return "proto{" + "age=" + age + ", name" + name + '\'' + ",id=" + id + "}";
    }
}
