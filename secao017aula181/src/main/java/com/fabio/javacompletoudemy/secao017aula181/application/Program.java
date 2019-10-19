package com.fabio.javacompletoudemy.secao017aula181.application;

import com.fabio.javacompletoudemy.secao017aula181.domain.entity.Product;

import java.io.*;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao012aula162
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product product = null;
		
		System.out.println("Enter a .csv file path: ");
		String strPath = sc.nextLine();

		File file = new File(strPath);
		String getFileParent = file.getParent();
		String outFolderPath = getFileParent + "\\out";
		String summaryFolderPath = outFolderPath + "\\summary.csv";
		
		boolean successCreateFolder = new File(outFolderPath).mkdir();
		System.out.println("Folder: " + outFolderPath + " success: " + successCreateFolder);
		try {
			boolean successCreateFile = new File(summaryFolderPath).createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while(br != null) {
				String[] getProductValues = line.split(",");
				String name = getProductValues[0];
				Double price = Double.valueOf(getProductValues[1]);
				Integer quantity = Integer.valueOf(getProductValues[2]);
				
				product = new Product(name, price, quantity);
				
				writeToFile(product, summaryFolderPath);
				
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();			
		}
	}
	
	public static void writeToFile(Product product, String path) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			String summaryItem = product.getName() + "," + String.valueOf(product.totalPrice());
			
			bw.write(summaryItem);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
