package com.epam;

public class App
{
    public static void resizeRectangle(Rectangle rectangle){
        rectangle.setHeight(10);
        rectangle.setWidth(5);
    }
    public static void main( String[] args )
    {
        Rectangle rectangle = new Rectangle();
        resizeRectangle(rectangle);

        Rectangle square = new Square();
        resizeRectangle(square);

        System.out.println("Rectangle area is "+rectangle.getArea());
        System.out.println("Square area is "+square.getArea()); // expects 50 but results 25


        RectangleShape newRectangle = new RectangleShape(10,5);
        System.out.println("Rectangle Area : " + newRectangle.getArea());

        SquareShape newSquare = new SquareShape(5);
        System.out.println("Square Area : "+ newSquare.getArea());


    }
}
