package com.epam.streams;

import java.util.Optional;

public class Day8 {
    public static void main(String[] args) {
        String s="";
        String str = Optional.ofNullable(s).filter(v->!v.trim().isEmpty()).orElse(null);
        System.out.println(str);
    }
}
