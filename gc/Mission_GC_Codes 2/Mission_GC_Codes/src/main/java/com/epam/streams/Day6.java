package com.epam.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Day6 {
    public static void main(String[] args) {
     String[][] arr = {{"Roopini","shren"},{"Neha","jaswanth"},{"praveen"}};
        System.out.println(Arrays.stream(arr).flatMap(Arrays::stream).collect(Collectors.toList()));
    }
}
