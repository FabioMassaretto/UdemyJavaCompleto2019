package com.fabio.javacompletoudemy.secao018aula186.service;

import com.fabio.javacompletoudemy.secao018aula186.domain.entity.CarRental;
import com.fabio.javacompletoudemy.secao018aula186.domain.entity.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxService brazilTaxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService brazilTaxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.brazilTaxService = brazilTaxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double) (t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment;
		if (hours < 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = brazilTaxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
