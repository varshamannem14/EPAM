package com.epam;

public class Square extends Rectangle{

    @Override
    public void setWidth(int width){
        this.width = width;
        this.height=width;
    }

    @Override
    public void setHeight(int height){
        this.height=height;
        this.width=height;
    }
}
