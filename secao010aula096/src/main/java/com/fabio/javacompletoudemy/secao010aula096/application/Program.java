package com.fabio.javacompletoudemy.secao010aula096.application;

import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao005aula078
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the dimension of a matrix (0 = use the matrix automatic defined): ");
		int n = sc.nextInt();
		
		int[][] mat;
		if (n == 0) {
			mat = new int[][] {{5,-3,10},{15,8,2},{7,9,-4}};			
		} else {
			mat = new int[n][n];

			for(int row = 0; row < mat.length; row++) {
				for(int col = 0; col < mat[row].length; col++) {
					mat[row][col] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println("");
		
		int count = 0;
		for(int row = 0; row < mat.length; row++) {
			for(int col = 0; col < mat[row].length; col++) {
				if(mat[row][col] < 0){
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();
	}
}
