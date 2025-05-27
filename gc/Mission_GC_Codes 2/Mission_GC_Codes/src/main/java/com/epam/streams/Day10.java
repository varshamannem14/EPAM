package com.epam.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day10 {
    public static void main(String[] args) {
        IntStream.iterate(1,n->n+2).limit(10).forEach(System.out::println);
        List<String> list = Arrays.asList("apple", "Banana", "cherry", "date");
        List<String> res = list.stream().sorted((t1,t2)->
        {if(t1.equalsIgnoreCase(t2))
        {return t2.compareTo(t1);}
            return t1.compareToIgnoreCase(t2);}).collect(Collectors.toList());
        System.out.println(res);

//        List<String> res = list.stream()
//                .sorted(Comparator.comparing(i -> i.toUpperCase()))
//                .collect(Collectors.toList());
//        System.out.println(res);



    }
}
