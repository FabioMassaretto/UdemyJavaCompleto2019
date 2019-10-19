package com.fabio.javacompletoudemy.secao017aula179.application;

import java.io.File;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao012aula161
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the folder path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\mkdir").mkdir();
		
		System.out.println("Directory crreated successfully: " + success);
		
		sc.close();

	}

}
