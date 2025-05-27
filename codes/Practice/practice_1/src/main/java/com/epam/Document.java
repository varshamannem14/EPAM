package com.epam;

public class Document implements Printable,Identifier{

    private int id;

    public Document(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void print(){
        System.out.println("Printing id" + id);
    }


}
