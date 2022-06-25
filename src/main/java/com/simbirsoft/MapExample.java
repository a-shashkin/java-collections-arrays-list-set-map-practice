package com.simbirsoft;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        // Experiment 1
        // Create a Map and use put() to add elements
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "Alexander Suvorov");
        stringMap.put(2, "Mikhail Kutuzov");
        stringMap.put(3, "George Zhukov");
        stringMap.put(4, "Konstantin Rokossovsky");
        System.out.println("We have created a Map:");
        System.out.println(stringMap);

        // Experiment 2
        // Find an element by key
        System.out.println("The element with key 3 is: " + stringMap.get(3));

        // Experiment 3
        // Use containsKey() to determine if there is an id equaling 5
        System.out.println("Statement \"We have a key equaling 5 in stringMap\" is " + stringMap.containsKey(5));

        // Experiment 4
        // Use putIfAbsent() to try and put elements with keys 3 and 5 and see what happens
        stringMap.putIfAbsent(3, "Vlasov");
        stringMap.putIfAbsent(5, "Joseph Stalin");
        System.out.println("We tried to put keys 3 and 5 in the map. Let's see what happened:");
        System.out.println(stringMap);

        // Experiment 5
        // print the results of keySet(), entrySet() and values() methods
        System.out.println("This is the keySet: " + stringMap.keySet());
        System.out.println("This is the entrySet: " + stringMap.entrySet());
        System.out.println("This is the values: " + stringMap.values());

        stringMap.replace(5, "Rodion Malinovsky");
        System.out.println("We replaced the fifth element, here is the result:");
        System.out.println(stringMap.values());

        // Experiment 6
        // Merge two integer maps
        Map<Integer, Integer> mapToMerge1 = Map.of(
                1, 1,
                2, 5,
                3, 8,
                4, 12,
                5, 20
        );

        Map<Integer, Integer> mapToMerge2 = Map.of(
                1, 4,
                2, 6,
                3, 11,
                4, 17,
                5, 25
        );

        Map<Integer, Integer> mergedMap = new HashMap<>(mapToMerge1);

        for (Map.Entry<Integer, Integer> entry : mapToMerge2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), (newValue, oldValue) -> newValue + oldValue);
        }

        System.out.println("This is the merged map:");
        System.out.println(mergedMap.values());
    }
}
