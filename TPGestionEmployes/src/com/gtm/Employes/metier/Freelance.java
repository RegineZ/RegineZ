package com.gtm.Employes.metier;

import java.util.Collection;

public class Freelance implements PayRole  {
	 
	private String siren;
	private Collection<Invoice> invoices;
	private String name;
	private String firstName;
	
	
	public Freelance(String siren, Collection<Invoice> invoices, String name, String firstName) {
		super();
		this.siren = siren;
		this.invoices = invoices;
		this.name = name;
		this.firstName = firstName;
	}
	@Override
	public Float calculateSalary() {
		float total = 0;
		for(Invoice invoice : invoices) {
			total = total + invoice.getTotal();
		}
		return total;
	}
	@Override
	public String getName() {
		
		return "freelance " + name;
	}
	@Override
	public String getFirstName() {
			return firstName ;
	}
	
	
	

}
