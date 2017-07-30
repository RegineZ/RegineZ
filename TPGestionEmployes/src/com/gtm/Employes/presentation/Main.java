package com.gtm.Employes.presentation;

import java.util.ArrayList;
import java.util.Date;

import com.gtm.Employes.metier.Employee;
import com.gtm.Employes.metier.EmployeeProducer;
import com.gtm.Employes.metier.EmployeeSalesman;
import com.gtm.Employes.metier.Freelance;
import com.gtm.Employes.metier.Invoice;
import com.gtm.Employes.metier.PayRole;
import com.gtm.Employes.metier.Staff;

public class Main {

	public static void main(String[] args) {

		final Staff myEmployees = new Staff();
		PayRole employee = new EmployeeSalesman("VITTU", "Olivier", 50, new Date(), 20000);
		myEmployees.addEmployee(employee);
		employee = new EmployeeProducer("Vittu", "Noémie", 50, new Date(), 10);
		myEmployees.addEmployee(employee);
		employee = new EmployeeSalesman("VITTU", "Romain", 14, new Date(), 1000);
		myEmployees.addEmployee(employee);

		ArrayList<Invoice> listeDeFactures = new ArrayList<Invoice>();

		Invoice facture = new Invoice();
		facture.setDate(new Date());
		facture.setLabel("Facture eau");
		facture.setTotal(500f);
		listeDeFactures.add(facture);

		facture = new Invoice();
		facture.setDate(new Date());
		facture.setLabel("Facture gaz");
		facture.setTotal(1000f);
		listeDeFactures.add(facture);

		Freelance freelance = new Freelance("abcd", listeDeFactures, "ZIEGLER", "Régine");
		myEmployees.addEmployee(freelance);

		listeDeFactures = new ArrayList<Invoice>();

		facture = new Invoice();
		facture.setDate(new Date());
		facture.setLabel("Facture eau");
		facture.setTotal(1500f);
		listeDeFactures.add(facture);

		facture = new Invoice();
		facture.setDate(new Date());
		facture.setLabel("Facture gaz");
		facture.setTotal(3000f);
		listeDeFactures.add(facture);

		freelance = new Freelance("abcd", listeDeFactures, "ZIEGLER", "Etienne");
		myEmployees.addEmployee(freelance);

		myEmployees.displaySalaries();

	}

}
