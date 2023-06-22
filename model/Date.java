package model;

import java.io.Serializable;
import java.util.Scanner;

import validate.Validate;

public class Date implements Serializable{
	private int day, month, year;
	public Date() {
		day = 1;
		month = 1;
		year = 1900;
	}
	public Date(int day, int month, int year) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	public int maxDay() {
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:{
				return 31;
			}
			case 4:
			case 6:
			case 9:
			case 11:{
				return 30;
			}
			case 2:{
				if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return 29;
				return 28;
			}
			default: return 1;
			
		}
		
	}
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(day<=0 || day > maxDay()) this.day = 1;
		else this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {;
		if(month <=0 || month >12) this.month = 1;
		 this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year<=0) this.year = 1;
		this.year = year;
	}
	public void output() {
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
	}
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year; 
	}
	public void input() {
		this.setYear(Validate.input("Year", 0, Integer.MAX_VALUE));
		this.setMonth(Validate.input("month", 0, 12));
		this.setDay(Validate.input("day", 0, this.maxDay()));
	}
	public void outtput() {
		System.out.println(this.day +"/" + this.month + "/" + this.year);
	}
	public int dayOfYear() {
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return 366;
		return 365;
	}
	
	
	
	public void next() {
		if( this.day == this.maxDay() ) {
			if(this.month == 12 ) {
				this.day = 1;
				this.month = 1;
				this.year++;
			}else {
				this.month++;
				this.day = 1;
			}
		}else {
			this.day++;
		}
	}
	
	
	public void previous() {
		if( this.day== 1 ) {
			if(this.month == 1 ) {
				this.day = 31;
				this.month = 12;
				this.year++;
			}else {
				this.month--;
				this.day = this.maxDay();
			}
		}else {
			this.day--;
		}
	}
	
	
	
	public Date nextDay() {
		Date a = new Date(this.day, this.month, this.year);
		a.next();
		return a;
	}
	
	
	public Date previousDay() {
		Date a = new Date(this.day, this.month, this.year);
		a.previous();
		return a;
	}

	
	public Date adddd(int a){
		Date b = new Date(this.day, this.month, this.year);
		b.day+= a;
		while(b.day > b.maxDay()) {
			int temp = b.day -b.maxDay();
			++b.month;
			if(b.month > 12 ) {
				b.month=1;
				++b.year;
			};
			b.day = temp;
		}
		return b;
	}
	
	
	
	public Date minusss(int a){
		Date b = new Date(this.day, this.month, this.year);
		b.day-= a;
		while(b.day < 1) {
			--b.month;
			if(b.month < 1 ) {
				b.month=12;
				b.year--;
			}
			b.day = b.maxDay()  + b.day;
		}
		return b;
	}

	
}
