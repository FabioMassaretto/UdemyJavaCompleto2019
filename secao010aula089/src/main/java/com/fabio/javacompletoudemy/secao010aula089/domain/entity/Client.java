package com.fabio.javacompletoudemy.secao010aula089.domain.entity;

public class Client {
	private String name;
	private String email;
	private int room;
	
	public Client(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getRoom() {
		return room;
	}
}
