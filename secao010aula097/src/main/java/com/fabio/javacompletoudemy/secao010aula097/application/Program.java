package com.fabio.javacompletoudemy.secao010aula097.application;

import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao005aula079
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in the matrix: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns in the matrix: ");
		int cols = sc.nextInt();
		
		Integer[][] matrix = new Integer[rows][cols];
		
		//Generate a random integer to fill the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 20);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Enter a number in the matrix to find the neightbors: ");
		int number = sc.nextInt();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == number) {
					System.out.printf("Position %d,%d%n", i, j);
					//left
					int indexLeft = j-1;
					if(indexLeft != -1) {
						System.out.println("Left: " + matrix[i][indexLeft]);
					}
					
					//right
					int indexRight = j+1;
					if(indexRight <= matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][indexRight]);
					}
					
					//Up
					int indexUp = i-1;
					if(indexUp != -1) {
						System.out.println("Up: " + matrix[indexUp][j]);
					}
					
					//Down
					int indexDown= i+1;
					if(indexDown <= matrix.length - 1) {
						System.out.println("Down: " + matrix[indexDown][j]);
					}
					
					System.out.println();
				}
			}
		}
		
		sc.close();
	}

}
