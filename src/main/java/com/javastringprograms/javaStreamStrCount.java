package com.javastringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.*;


public class javaStreamStrCount {

    public void countOccurance(String s) {
        // HashMap char as a key and occurrence as a value
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        // Convert String to Char Array
        //char[] charArray = inputString.toCharArray();

        for (Character ch : s.toCharArray()) {
            // If char is already present in Map increment count by one

            if (!s.equals(" ")) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                }

                // If char is not present set key value to 1
                else {
                    map.put(ch, 1);
                }
            }

        }
        // Print CharCount Map
        System.out.println(map);
        System.out.println(map);
    }

    public static void main(String[] args) {

        javaStreamStrCount oc = new javaStreamStrCount();
        //oc.countOccurance("My name is Lavanya");
        //oc.oneLineStringCounter();
        oc.thirdTry();
    }

    public void oneLineStringCounter() {
        var str = "My name is Lavanya";

        Map<Character, Long> charCounts = new HashMap<>();
        charCounts.put('a', str.chars().filter(c -> c == 'a').count());
        charCounts.put('n', str.chars().filter(c -> c == 'n').count());

        for (Character key : charCounts.keySet())
            System.out.println(key + " - " + charCounts.get(key));
    }

    public void thirdTry(){
        var str = "My name is Lavanya";

        //Shyam code
        //Map<Character, Long> map = str.chars().streams().filter(s -> s != null).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //Closest working solution
        Map<String, Long> map = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        //Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

        //Work in progress
       // Map<Character, Long> map = str.chars().filter(s -> s != ' ').map(Character::toLowerCase).collect(Collectors.groupingBy(s -> s, IntStream::new, Collectors.counting()));
        System.out.println(map);
    }
}
