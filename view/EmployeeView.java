package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import controller.EmployeeController;
import model.Contract;
import model.Employee;
import model.Regular;

public class EmployeeView {
	private EmployeeController contr;

	public EmployeeView(EmployeeController contr) {
		this.contr = contr;
	}

	public void showView() {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("1.Add a Employee");
			System.out.println("2.Save list to file");
			System.out.println("3. Get from file ");
			System.out.println("4.List Employee");
			System.out.println("5. sort by salary ");
			System.out.println("6. sort by name");
			n = sc.nextInt();
			sc.nextLine();
			switch (n) {
			case 1: {
				contr.addEmployee();
				break;

			}
			case 2: {

				contr.saveToFile();
				break;
			}
			case 3: {
				try {
					contr.readFromFile();
				} catch (ClassNotFoundException | IOException e) {
					e.printStackTrace();
				}
				break;
			}
			case 4: {
				contr.print();
				break;
			}
			case 5: {
				contr.sortSalary();
			}
			case 6: {
				contr.sortByName();
			}
			}
		} while (n != 0);
	}
}
