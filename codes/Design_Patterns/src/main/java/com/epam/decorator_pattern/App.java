package com.epam.decorator_pattern;

public class App
{
    public static void main(String[] args) {

        Coffee espresso = new Espresso();

        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

        espresso = new WithMilk(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

        espresso = new WithSugar(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

        espresso = new WithSugar(espresso);
        espresso = new WithSugar(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

    }
}
