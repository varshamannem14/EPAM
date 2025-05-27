package com.epam.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class reverse {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String res3 = Arrays.stream(str.split("\\s+")).map(x->new StringBuilder(x).reverse()).reverse().collect(Collectors.joining(" "));
        System.out.println(res3);
    }
}
