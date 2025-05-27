package com.epam.streams;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class    Day1 {
    public static void main(String[] args) {
       // List<Integer> list = Arrays.asList(1,2,3,4,4,4,5,8,8);
//        //1. Even and odd using streams
//        List<Integer> even = list.stream().filter(n->n%2==0).collect(Collectors.toList());
//        List<Integer> odd = list.stream().filter(n->n%2!=0).collect(Collectors.toList());
//        System.out.println(even);
//        System.out.println(odd);
//        //2. Removing the duplicates
//        List<Integer> res = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(res);
//       //3.Printing the duplicates
//        List<Integer> res = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))
//                .entrySet().stream()
//                .filter(entry->entry.getValue()>1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//        System.out.println(res);

//        //4. Reversing the array
//         List<Integer> res = list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
//        System.out.println(res);
//
//
//        //5. Longest word in the String
//        String str = "Java is a programming language";
//        String res = Arrays.stream(str.split("\\s+")).max(Comparator.comparingInt(String::length)).orElse(" ");
//        Integer res1 = Arrays.stream(str.split("\\s+")).mapToInt(String::length).max().orElse(0);
//        System.out.println(res1);
//        //6. Second Longest word in the string
//
        List<String> str = Arrays.asList("Roopini","Varsha","Yashu","Madhavi");
        String res = str.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(res);

        String s = "Java is a programming language";
        String r = Arrays.stream(s.split("\\s+")).sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().get();
        System.out.println(r);

//        int sum1 = IntStream.range(0,11).sum();
//        System.out.println(sum1);

        //8. Reversing the words in the string
//
//
        String str2 = "Epam is great place to work";
        String res1 = Arrays.stream(str2.split("\\s+")).map(x->new StringBuilder(x).reverse()).collect(Collectors.joining(" "));
        System.out.println(res1);


        String st = "Epam is great place to work";
        List<String> list = Arrays.asList(st.split("\\s+"));
        Collections.reverse(list);
        String res3 = list.stream().map(x->new StringBuilder(x).reverse()).collect(Collectors.joining(" "));
        System.out.println(res3);




    }
}
