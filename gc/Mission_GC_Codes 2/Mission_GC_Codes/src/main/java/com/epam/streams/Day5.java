package com.epam.streams;
import java.util.Map;
import java.util.stream.Collectors;

public class Day5 {
    public static void main(String[] args) {
        //1)Given a String, find the first non-repeated character in it using Stream functions?
        String str = "aabbcddef";
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Character res = str.chars().mapToObj(c -> (char) c).filter(x -> map.get(x) == 1).findFirst().get();
        System.out.println(res);
    }

}
