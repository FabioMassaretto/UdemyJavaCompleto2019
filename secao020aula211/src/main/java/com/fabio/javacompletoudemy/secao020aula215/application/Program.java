package com.fabio.javacompletoudemy.secao020aula215.application;

public class Program {
    private static final int GLOBAL_VALUE = 3;

    public static void main(String[] args) {
        int[] vect = new int[] {3, 4, 5};

        addToOddNumber(vect);
    }

    public static void addToOddNumber(int[] vect){
        for(int value : vect) {
            if(value % 2 != 0){
                value += GLOBAL_VALUE;
            }
            System.out.println(value);
        }
    }
}
