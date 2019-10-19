package com.fabio.javacompletoudemy.secao014aula127.domain.entity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Formatter;

public class UsedProduct extends Product{

	private Date manufactureDate;
	LocalDate localDate;
	Formatter formatter;

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return String.format("%s (used) $ %.2f (Manufacture date: %s)",
				super.getName(), super.getPrice(), new SimpleDateFormat("dd/MM/yyyy").format(manufactureDate));
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
}
