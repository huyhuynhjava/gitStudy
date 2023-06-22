package model;

import java.io.Serializable;
import java.util.Scanner;

public class Contract extends Employee implements Serializable{
	private double gradeSalary;
	public Contract() {
		super();
		this.gradeSalary = gradeSalary;
	}
	public Contract(String id) {
		super(id);
	}
	public Contract(String firstName, String lastName, String gender, String phone, Address add, Date dob, String id, String office, double allowdance, double salary, double gradeSalary ) {
		super(firstName, lastName, gender, phone, add, dob,id, office, allowdance, salary );
		this.gradeSalary = gradeSalary;
	}
	
	public double getGradeSalary() {
		return gradeSalary;
	}
	public void setGradeSalary(double gradeSalary) {
		this.gradeSalary = gradeSalary;
	}
	@Override
	public String toString() {
		return super.toString() + " | " + "gradeSalary: " + this.gradeSalary;
	}
	public double salary() {
		return this.gradeSalary + this.allowdance;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your gradeSalary");
		this.gradeSalary = sc.nextDouble();
		
	}

}
