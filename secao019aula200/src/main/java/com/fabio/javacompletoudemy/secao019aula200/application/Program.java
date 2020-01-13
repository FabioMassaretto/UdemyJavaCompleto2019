package com.fabio.javacompletoudemy.secao019aula200.application;

import com.fabio.javacompletoudemy.secao019aula200.domain.entity.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        // Aqui ele compara o object alocado na memoria, como c1 e c2 criam novo objeto
        // retorna false
        System.out.println(c1 == c2);


        // Para literal, o Java faz um tratamento especial
        System.out.println(s1 == s2);
    }
}
