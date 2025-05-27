package com.epam.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Roopini","Roopini","Yashu");
        List<String> res = list.stream().
                collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(res);

    }
}
