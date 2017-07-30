package com.gtm.Employes.metier;

import java.util.Date;

public class EmployeeSalesman extends Employee {

	private float turnOver;
	private final float primeS = 400;

	public EmployeeSalesman(String name, String firstName, int age, Date hireDate, float turnOver) {
		super(name, firstName, age, hireDate);
		this.turnOver = turnOver;
	}


	public float getTurnOver() {
		return turnOver;
	}


	public void setTurnOver(float turnOver) {
		this.turnOver = turnOver;
	}


	public Float calculateSalary() {

		return (turnOver * 20 / 100 + primeS);
	}

}
