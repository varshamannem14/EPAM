package com.epam.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,4,1);
        Long res = list.stream().collect(Collectors.counting());
        System.out.println(res);


    }
}
