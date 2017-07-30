package com.gtm.Employes.metier;

import java.util.Date;

public class Employee implements PayRole {

	private String name;
	private String firstName;
	private int age;
	private Date hireDate;

	public String getName() {
		return "salary " + name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Employee(String name, String firstName, int age, Date hireDate) {
		super();
		System.out.println("======>   " + getClass().getSimpleName());
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.hireDate = hireDate;
	}
	public Float calculateSalary() {
		return 0f;
	}
}
