package com.epam.streams;

import java.util.Arrays;
import java.util.List;

public class Day4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Roopini","Yashu","aishu","Neha");
        Long res = list.stream().filter(x->x.contains("a")).count();
        System.out.println(res);
    }
}
