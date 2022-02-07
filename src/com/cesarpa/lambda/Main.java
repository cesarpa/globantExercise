package com.cesarpa.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // Alexey_Sentsov@epam.com
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AD", "AWs", "awe");
        removeUpperString(list).forEach(System.out::println);
    }

    private static List<String> removeUpperString(List<String> list) {
        return list.stream().filter( i -> i.toLowerCase().equals(i)).collect(Collectors.toList());
    }
}