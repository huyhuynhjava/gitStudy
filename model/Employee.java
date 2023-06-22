package model;

import java.io.Serializable;
import java.util.Scanner;


public abstract class Employee extends Person implements Serializable  {
	protected String id;
	protected String office;
	protected double allowdance, salary;
	public Employee() {
		id = "";
		office = "";
		allowdance = 0;
		salary = 0;
	}
	public Employee(String id) {
		this.id = id;
	}
	public Employee(String firstName, String lastName, String gender, String phone, Address add, Date dob, String id, String office, double allowdance, double salary) {
		super(firstName, lastName, gender, phone, add, dob);
		this.id = id;
		this.office = office ;
		this.allowdance = allowdance;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getAllowdance() {
		return allowdance;
	}
	public void setAllowdance(double allowdance) {
		this.allowdance = allowdance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString()+" | " + "ID: "+ this.id + " | " + "Office: "+  this.office + " | "+ "Allowdance: " + this.allowdance + " | " +"Salary: "+ this.salary; 
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id");
		this.id = sc.nextLine();
		System.out.println("enter your office");
		this.office = sc.nextLine();
		System.out.println("enter your allowdance");
		this.allowdance = Double.parseDouble(sc.nextLine());
		System.out.println("enter your salary");
		this.salary = Double.parseDouble(sc.nextLine());
	}
	public abstract double salary();
	
}
