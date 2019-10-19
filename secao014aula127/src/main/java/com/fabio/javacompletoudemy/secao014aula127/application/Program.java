package com.fabio.javacompletoudemy.secao014aula127.application;

import com.fabio.javacompletoudemy.secao014aula127.domain.entity.ImportedProduct;
import com.fabio.javacompletoudemy.secao014aula127.domain.entity.Product;
import com.fabio.javacompletoudemy.secao014aula127.domain.entity.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao009aula109
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product product = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> productList = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int numProduct = sc.nextInt();
		
		for (int i = 1; i <= numProduct; i++) {
			System.out.printf("Product #%d data:%n", i);
			System.out.println("Common, used or imported (c/u/i)?");
			sc.nextLine();
			char productType = sc.nextLine().charAt(0);
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			
			switch (productType) {
				case 'c':
					product = new Product(name, price);
					break;
				case 'u':
					System.out.println("Manufacture date (DD/MM/YYYY)");
					sc.nextLine();
					String date = sc.nextLine();
					Date manufactureDate = null;
					try {
						manufactureDate = sdf.parse(date);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					product = new UsedProduct(name, price, manufactureDate);
					break;
				case 'i':
					System.out.println("Customs fee: ");
					Double customsFee = sc.nextDouble();
					product = new ImportedProduct(name, price, customsFee);
					break;
			}
			
			productList.add(product);
		}
		
		System.out.println("Price Tags:");
		for (Product item : productList) {
			System.out.println(item.priceTag());
		}

	}

}
