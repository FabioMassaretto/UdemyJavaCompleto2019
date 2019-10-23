package com.fabio.javacompletoudemy.secao013aula117.application;

import com.fabio.javacompletoudemy.secao013aula117.domain.entity.Comment;
import com.fabio.javacompletoudemy.secao013aula117.domain.entity.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao008aula099
public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment comment1 = new Comment("Have a nice trip!");
		Comment comment2 = new Comment("WOW that\'s awsome!!");
		
		Post post1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Travelling to NewZealand", 
				"I'm going to visit this wonderful country", 12);
		
		Post post2 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Travelling to NewZealand", 
				"I'm going to visit this wonderful country", 12);
		
		post1.addComment(comment1);
		post1.addComment(comment2);
		
		System.out.println(post1);
		//System.out.println(post2);
	}

}
