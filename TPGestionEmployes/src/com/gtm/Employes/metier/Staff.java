package com.gtm.Employes.metier;

import java.util.ArrayList;
import java.util.Collection;

public class Staff {

	// private ArrayList<Employee> myEmployees;
	private Collection<PayRole> myEmployees;

	public Staff() {
		super();
		this.myEmployees = new ArrayList<PayRole>();
	}

	public void addEmployee(PayRole employee) {
		myEmployees.add(employee);
	}

	public void displaySalaries() {
		// for (int i = 0; i < myEmployees.size(); i++) {
		// Employee employee = myEmployees.get(i);
		// System.out.println("Le salaire de l'employé " + employee.getName() + " est :
		// " + employee.calculateSalary());
		// }

		for (PayRole employee : myEmployees) {
			System.out.println("Le salaire de l'employé  " + employee.getName() + ", " + employee.getFirstName()
					+ " est : " + employee.calculateSalary());
		}

	}

}
