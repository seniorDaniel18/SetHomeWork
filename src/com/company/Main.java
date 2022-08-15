package com.company;

import java.util.*;

import static java.util.Locale.filter;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();

        set1.add(5);
        set1.add(7);
        set1.add(9);
        set1.add(11);

        Set<Integer> set2 = new HashSet<>();

        set2.add(1);
        set2.add(3);
        set2.add(5);
        set2.add(7);

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(symmetricDifference(set1, set2));


    }

        public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
            Set<Integer> symmetricDiff = new HashSet<>(set1);
            symmetricDiff.addAll(set2);
            Set<Integer> tmp = new HashSet<>(set2);
            tmp.retainAll(set1);
            symmetricDiff.removeAll(tmp);
            return symmetricDiff;
    }
}



