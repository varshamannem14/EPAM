package com.epam.streams;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Day2 {
    public static void main(String[] args) {
 //1. Convert the list elements into the comma seperated string
       // List<Integer> list = Arrays.asList(1, 21, 23, 4, 25);
//        String res = list.stream().map(String::valueOf).collect(Collectors.joining(","));
//        System.out.println(res);
//
//        //2. Return the list of the elements that are starting with 2
//
//        List<Integer> res = list.stream().filter(num->String.valueOf(num).startsWith("2")).collect(Collectors.toList());
//        System.out.println(res);

        //3. Anagrams or not
        String str1 = "Rat";
        String str2 = "Act";
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        s1 = Arrays.stream(s1.split("")).sorted().collect(Collectors.joining());
        s2 = Arrays.stream(s2.split("")).sorted().collect(Collectors.joining());
        if(s1.equals(s2))
        {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }

    }

}
