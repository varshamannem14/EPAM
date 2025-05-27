package com.epam.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Roopini","John","John");
        List<String> res = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(res);

    }
}
