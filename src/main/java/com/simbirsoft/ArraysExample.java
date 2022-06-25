package com.simbirsoft;

import java.util.*;

public class ArraysExample {

    public static void main(String[] args) {

        // Experiment 1
        // Create an int array with ten numbers and print it
        int[] arrayOfTenRandomNumbers = new int[10];
        generateRandomIntArray(arrayOfTenRandomNumbers);
        System.out.println("This is the original array we created:");
        printIntArray(arrayOfTenRandomNumbers);

        // Experiment 2
        // Create a copy of original array, but only with first 5 numbers
        int[] copyOfArrayShortened = Arrays.copyOf(arrayOfTenRandomNumbers, 5);
        System.out.println("This is the array we created with \"copyOf\" method and newLength equaling 5:");
        printIntArray(copyOfArrayShortened);

        // Experiment 3
        // Sort the original array
        Arrays.sort(arrayOfTenRandomNumbers);
        System.out.println("This is the sorted original array:");
        printIntArray(arrayOfTenRandomNumbers);

        // Experiment 4
        // Sort a part of array
        int[] secondArrayOfTenRandomInts = new int[10];
        generateRandomIntArray(secondArrayOfTenRandomInts);
        Arrays.sort(secondArrayOfTenRandomInts, 2, 7);
        System.out.println("This is the array with only elements from 3rd to 8th sorted:");
        printIntArray(secondArrayOfTenRandomInts);
    }

    public static void generateRandomIntArray(int[] intArray) {
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(11);
        }
    }

    public static void printIntArray(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
        System.out.println();
    }
}
