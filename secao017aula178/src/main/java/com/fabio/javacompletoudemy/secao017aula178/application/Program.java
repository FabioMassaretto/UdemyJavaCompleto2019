package com.fabio.javacompletoudemy.secao017aula178.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao012aula160
public class Program {
    public static void main(String[] args) {
        String[] lines = {"Good mornig", "Good Afternoon", "Good night"};

        String path = "C:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
