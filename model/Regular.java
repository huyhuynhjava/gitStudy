package model;

import java.io.Serializable;
import java.util.Scanner;

public class Regular extends Employee implements Serializable {
	private int experience;
	private double rate, basicSalary;
	public Regular() {
		super();
		this.experience = 0;
		this.rate = 0;
		this.basicSalary =0;
	}
	public Regular(String firstName, String lastName, String gender, String phone, Address add, Date dob, String id, String office, double allowdance, double salary, int experience, double rate, double basicSalary) {
		super(firstName, lastName, gender, phone, add, dob,id, office, allowdance, salary );
		this.experience = experience;
		this.rate = rate;
		this.basicSalary = basicSalary;
	}
	public Regular(String id) {
		super(id);
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return super.toString() + " | " + "experience: " + this.experience + " | " + " basicSalary: " + this.basicSalary + " | " + " rate salary: " + this.rate;
	}
	public double salary() {
		return rate * basicSalary +allowdance;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your experience");
		this.experience = sc.nextInt();
		System.out.println("enter your rate");
		this.rate =  sc.nextDouble();
		System.out.println("enter your basicSalary");
		this.basicSalary = sc.nextDouble();
	}
	
}
