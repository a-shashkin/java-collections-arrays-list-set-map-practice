package com.simbirsoft;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        // Experiment 1
        // Make a List<String> and a List<Integer> and add some elements
        List<String> stringList = new ArrayList<>();
        stringList.add("Grad");
        stringList.add("Uragan");
        stringList.add("Smerch");
        stringList.add("Buratino");
        System.out.println("This is a List<String>:");
        System.out.println(stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(25);
        integerList.add(50);
        integerList.add(100);
        System.out.println("This is a List<Integer>:");
        System.out.println(integerList);

        // Experiment 2
        // Make an empty list and use isEmpty() function
        List<String> emptyList = new ArrayList<>();
        System.out.println("We made an empty List<String> and called it emptyList. Let's check if it's empty.");
        isListEmpty(emptyList);
        System.out.println("Now we check if stringList is empty.");
        isListEmpty(stringList);

        // Experiment 3
        // Create a List<Integer>, fill it, and then make it empty via Iterator
        List<Integer> makeThisListEmpty = new ArrayList<>();
        makeThisListEmpty.add(10);
        makeThisListEmpty.add(25);
        makeThisListEmpty.add(50);
        makeThisListEmpty.add(100);

        Iterator<Integer> iterator = makeThisListEmpty.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            iterator.remove();
        }
        System.out.println("We made a List<Integer> called makeThisListEmpty. All elements were removed via Iterator. Let's check if list is empty.");
        isListEmpty(makeThisListEmpty);

        // Experiment 4
        // Make arrays out of Lists made in Experiment 5
        String[] stringArrayFromList = stringList.toArray(new String[4]);
        Integer[] intArrayFromList = integerList.toArray(new Integer[4]);
        System.out.println("Now we print arrays made from stringList and integerList:");
        System.out.println(Arrays.toString(stringArrayFromList));
        System.out.println(Arrays.toString(intArrayFromList));

        // Experiment 5
        // Remove some elements from list
        List<Integer> removeElementsFromThisList = new ArrayList<>();
        removeElementsFromThisList.add(10);
        removeElementsFromThisList.add(20);
        removeElementsFromThisList.add(30);
        removeElementsFromThisList.add(40);
        removeElementsFromThisList.add(50);
        removeElementsFromThisList.remove(2);
        removeElementsFromThisList.remove(2);
        System.out.println("We made a List<Integer> called removeElementsFromThisList. It had numbers 10, 20, 30, 40 and 50. We removed 20 and 50.");
        System.out.println(removeElementsFromThisList);

        // Experiment 6
        // Remove all elements equaling 25 from list
        List<Integer> removeElementsFromThisList2 = new ArrayList<>();
        removeElementsFromThisList2.add(10);
        removeElementsFromThisList2.add(20);
        removeElementsFromThisList2.add(25);
        removeElementsFromThisList2.add(40);
        removeElementsFromThisList2.add(50);
        removeElementsFromThisList2.add(25);
        removeElementsFromThisList2.add(25);
        removeElementsFromThisList2.add(80);
        removeElementsFromThisList2.add(90);

        Iterator<Integer> removingIterator = removeElementsFromThisList2.iterator();
        while (removingIterator.hasNext()) {
            if (removingIterator.next().equals(25)) {
                removingIterator.remove();
            }
        }

        System.out.println("We made a List<Integer> called removeElementsFromThisList. We removed all elements equaling 25.");
        System.out.println(removeElementsFromThisList2);

        // Experiment 7
        // Make a List using the Arrays.asList method

        List<String> stringListFromArray = Arrays.asList("Solntsepyok");
        System.out.println("We made a List<String> from an array via Arrays.asList method");
        System.out.println(stringListFromArray);

        // Experiment 8
        // Sort removeElementsFromThisList2 List and stringList

        removeElementsFromThisList2.sort(Comparator.comparing(Integer::intValue));
        System.out.println("This is sorted removeElementsFromThisList2:");
        System.out.println(removeElementsFromThisList2);
        stringList.sort(String::compareTo);
        System.out.println("This is sorted stringList:");
        System.out.println(stringList);
    }

    public static boolean isListEmpty(List list){
        if (list.isEmpty()) {
            System.out.println("The list is empty");
            return true;
        } else {
            System.out.println("The list is NOT empty, it has elements");
            return false;
        }
    }
}
