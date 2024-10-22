package com.core.company.capgemini;

import java.util.*;
import java.util.stream.Collectors;


public class FindoutDuplicateElementArrayTest {

    public static void main(String[] args) {
        int arr[] = {12,9,4,11,4};
        Set<Integer> duplicates = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("Duplicate elements: " + duplicates);
    }


}

