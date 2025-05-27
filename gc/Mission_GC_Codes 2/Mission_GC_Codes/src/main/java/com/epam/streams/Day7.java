package com.epam.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day7 {
    public static void main(String[] args) {
//        String str = "abacabaaaa";
//        Map.Entry<Character,Long> map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,Collectors.counting()))
//                .entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow(()-> new RuntimeException("NO frequent character found"));
//        System.out.println(map.getKey());

        List<String> list = Arrays.asList("roopini","moom","noon","madam","racecar");
        String res = list.stream().filter(str->(Palindrome(str))).max((s1,s2)->Integer.compare(s1.length(),s2.length())).orElse(null);
        System.out.println(res);


    }
    public static boolean Palindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
