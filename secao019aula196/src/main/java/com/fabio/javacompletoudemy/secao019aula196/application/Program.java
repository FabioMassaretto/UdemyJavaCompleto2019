package com.fabio.javacompletoudemy.secao019aula196.application;

import com.fabio.javacompletoudemy.secao019aula196.service.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many value to add?");
        int n = sc.nextInt();

        PrintService<String> ps = new PrintService<>();

        for (int i = 0; i < n; i++){
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());
    }
}
