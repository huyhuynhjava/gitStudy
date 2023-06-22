package controller;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import model.Contract;
import model.Employee;
import model.EmployeeModel;
import model.Regular;
import view.EmployeeView;

public class EmployeeController {
	private EmployeeModel model;

	public EmployeeController(EmployeeModel model) {
		this.model = model;
	}

	public void addEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add an Regular employee");
		System.out.println("2.Add an Contract employee");
		int n = sc.nextInt();
		if (n == 1) {
			Employee r = new Regular();
			r.input();
			model.getList().add(r);
		} else if (n == 2) {
			Employee r = new Contract();
			r.input();
			model.getList().add(r);
		}

	}

	public void print() {
		for (Employee e : model.getList()) {
			System.out.println(e);
		}
	}

	public void saveToFile() {
		FileOutputStream file = null;
		ObjectOutputStream write = null;
		try {
			file = new FileOutputStream(model.getFile());
			write = new ObjectOutputStream(file);

			for (Employee e : model.getList()) {
				write.writeObject(e);
			}
			write.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (write != null)
					write.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void readFromFile() throws ClassNotFoundException, IOException {
		FileInputStream file = null;
		ObjectInputStream read = null;
		try {
			file = new FileInputStream(model.getFile());
			read = new ObjectInputStream(file);

			while (true) {
				try {
					Employee employee = (Employee) read.readObject();
					model.getList().add(employee);
				} catch (EOFException e) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (read != null)
					read.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void sortSalary() {
		model.getList().sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.salary() - o2.salary());
			}
		});
	}

	public void prinRegular() {
		for (Employee e : model.getList()) {
			if (e instanceof Regular)
				System.out.println(e);
		}
	}

	public void sortByName() {
		model.getList().sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getFirstName().compareTo(o2.getFirstName()) > 0)
					return o1.getFirstName().compareTo(o2.getFirstName());
				else if (o1.getFirstName().compareTo(o2.getFirstName()) == 0) {
					return o1.getLastName().compareTo(o2.getLastName());
				}
				return -1;
			}

		});
	}

	public void searchByEX() {
		for (Employee e : model.getList()) {
			if (e instanceof Regular) {
				if (((Regular) e).getExperience() == 3)
					System.out.println(e);
			}
		}
	}

	public void searchByID(String id) {
		for (Employee e : model.getList()) {
			if (e.getId().equals(id))
				System.out.println(e);
		}
	}
	public void remove(int n) {
		model.getList().remove(n);
	}

}
