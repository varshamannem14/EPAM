package com.epam;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main{



    public static void main(String[] args) {

        //Given a list of integers, divide into two lists one having even numbers and other having odd numbers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().collect(Collectors.groupingBy());

    }

}


