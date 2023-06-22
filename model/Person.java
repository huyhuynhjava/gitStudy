package model;

import java.io.Serializable;
import java.util.Scanner;

public class Person  implements Serializable{
	protected String firstName;
	protected String lastName;
	protected String gender;
	protected String phone;
	protected Address add;
	protected Date dob;
	
	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.gender ="";
		this.phone ="";
		this.add = new Address();
		this.dob = new Date();
	}

	public Person(String firstName, String lastName, String gender, String phone, Address add, Date dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
		this.add = add;
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first name");
		this.firstName = sc.nextLine();
		System.out.println("enter your last name");
		this.lastName = sc.nextLine();
		System.out.println("enter your gender");
		this.gender = sc.nextLine();
		System.out.println("enter your phone number");
		this.phone = sc.nextLine();
		System.out.println("enter your address");
		this.add.input();
		System.out.println("enter your birthday");
		this.dob.input();
	}

	@Override
	public String toString() {
		return   "Name : " +this.firstName +" " + this.lastName + " | " + "Gender: " +  this.gender + " | " + "Phone number: "+ this.phone + " | " + "Adress: " + this.add + " | " +"Birthday:" + this.dob ;
	}
}

