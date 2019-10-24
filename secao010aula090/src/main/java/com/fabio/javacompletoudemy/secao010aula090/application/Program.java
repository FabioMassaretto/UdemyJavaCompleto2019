package com.fabio.javacompletoudemy.secao010aula090.application;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao005aula072
public class Program {

	public static void main(String[] args) {
		// Boxing
		int x = 20;
		Object obj = x;
		
		System.out.println(obj);
		
		//unboxing
		int y = (int) obj;

		System.out.println(y);
		
		//WrapperClass
		Integer z = x;
		
		System.out.println(z);
	}
}