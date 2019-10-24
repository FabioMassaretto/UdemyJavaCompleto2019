package com.fabio.javacompletoudemy.secao010aula093.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao005aula075
public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Joao");
		list.add("Marcos");
		list.add("Anna");
		list.add(2, "Alex");
		
		System.out.println(list.size());
		
		for (String item : list) {
			System.out.println(item);
		}

		System.out.println("---------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println("---------------------------------");
		System.out.println("Index of Joao: " + list.indexOf("Alex"));
		System.out.println("Index of Marcos: " + list.indexOf("Marcos"));
		System.out.println("---------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String item : result) {
			System.out.println(item);
		}
		System.out.println("---------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
		String nameNonExist = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
		
		System.out.println(nameNonExist);
		
	}
	

}
