package com.simbirsoft;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        // Experiment 1
        // Make a Set

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Su-35");
        stringSet.add("Su-34");
        stringSet.add("Su-25");
        stringSet.add("Su-57");
        stringSet.add("MiG-35");
        stringSet.add("MiG-29");
        System.out.println("This is a set:" + stringSet);

        // Experiment 2
        // Remove elements from Set

        stringSet.remove("Su-57");
        stringSet.remove("MiG-29");
        System.out.println("This is a set with removed elements:" + stringSet);

        // Experiment 3
        // Use the stream().sorted() method and see what happens
        Set<Integer> integerSetToSort = new HashSet<>();
        integerSetToSort.add(90);
        integerSetToSort.add(50);
        integerSetToSort.add(120);
        integerSetToSort.add(200);
        integerSetToSort.add(10);
        integerSetToSort.add(250);
        integerSetToSort.add(70);
        System.out.println("This is a set after stream().sorted() is called:" + integerSetToSort);

        // Experiment 4
        // Check if integerSetToSort contains values 120 and 300
        System.out.println("Set integerSetToSort contains 120: " + integerSetToSort.contains(120));
        System.out.println("Set integerSetToSort contains 300: " + integerSetToSort.contains(300));

        // Experiment 5
        // Add a subset of elements into stringSet
        Set<String> subsetToAdd = new HashSet<>();
        subsetToAdd.add("Su-57");
        subsetToAdd.add("MiG-29");
        stringSet.addAll(subsetToAdd);
        System.out.println("This is a set with added substring of elements:" + stringSet);
    }
}
