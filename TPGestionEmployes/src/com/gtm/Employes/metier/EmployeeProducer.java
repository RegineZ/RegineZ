package com.gtm.Employes.metier;

import java.util.Date;

public class EmployeeProducer extends Employee {

	private int nbrUnit;
	private final Float productRate = 5.0f;

	public EmployeeProducer(String name, String firstName, int age, Date hireDate, int nbrUnit) {
		super(name, firstName, age, hireDate);
		System.out.println("on passe ici !");
		setNbrUnit(nbrUnit);
		// TODO Auto-generated constructor stub
	}

	public int getNbrUnit() {
		return nbrUnit;
	}

	public void setNbrUnit(int value) {
		System.out.println("this.nbrUnit = " + this.nbrUnit);
		System.out.println("value = " + value);
		nbrUnit = value;
	}

	public Float calculateSalary() {
		return (nbrUnit * productRate);
	}
}
