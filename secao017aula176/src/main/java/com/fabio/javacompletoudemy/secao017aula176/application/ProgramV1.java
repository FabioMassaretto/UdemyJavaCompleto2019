package com.fabio.javacompletoudemy.secao017aula176.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao012aula158
public class ProgramV1 {
    public static void main(String[] args) {

        String path = "F:\\opt\\workspace2\\UdemyJavaCompleteCourse\\in.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
