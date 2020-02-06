package com.fabio.javacompletoudemy.secao018aula191.application;

import com.fabio.javacompletoudemy.secao018aula191.domain.entity.ComboDevice;
import com.fabio.javacompletoudemy.secao018aula191.domain.entity.ConcretePrinter;
import com.fabio.javacompletoudemy.secao018aula191.domain.entity.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1000");
        p.processDoc("My letter");
        p.print("My letter");

        ConcreteScanner s = new ConcreteScanner("123");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());

        ComboDevice cd = new ComboDevice("444");
        cd.processDoc("My dissertation");
        cd.print("My dissertation");
        System.out.println("Scan result: " + cd.scan());
    }
}
