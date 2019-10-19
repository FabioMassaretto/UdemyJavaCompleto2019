package com.fabio.javacompletoudemy.secao017aula175.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao012aula157
public class Program {
    public static void main(String[] args) {

        File file = new File("F:\\opt\\workspace2\\UdemyJavaCompleteCourse\\in.txt");

        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(sc != null)
                sc.close();
        }
    }
}
