package com.epam;

public class SquareShape implements Shape{

    private int side;

    public SquareShape(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea(){
        return side*side;
    }

}
