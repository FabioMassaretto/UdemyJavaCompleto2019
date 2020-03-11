package com.fabio.javacompletoudemy.secao019aula202.application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        //printHashSet();
        //printTreeSet();
        //printLinkedHashSet();
        operations();
    }

    private static void printHashSet() {
        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p: set) {
            System.out.println(p);
        }
    }

    private static void printLinkedHashSet() {
        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p: set) {
            System.out.println(p);
        }
    }

    private static void printTreeSet() {
        Set<String> set = new TreeSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p: set) {
            System.out.println(p);
        }
    }

    private static void operations(){
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        // union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);

        System.out.println(c);

        // intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);

        System.out.println(d);

        // difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);

        System.out.println(e);
    }
}
