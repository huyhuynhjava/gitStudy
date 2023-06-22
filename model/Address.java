package model;

import java.io.Serializable;
import java.util.Scanner;

import validate.Validate;

public class Address implements Serializable {
	private int houseNumber;
	private String street;
	private String city;
	public Address() {
		this.houseNumber = 0;
		this.street = "";
		this.city ="";
	}
	
	public Address(int houseNumber, String street, String city) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
	}

	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return this.houseNumber + "/" + this.street;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		this.houseNumber = Validate.input("Enter house number", 0);
		this.street = Validate.input("Enter street");
	}
	public void output() {
		System.out.print(this.houseNumber + "/" + this.street);
	}
}
