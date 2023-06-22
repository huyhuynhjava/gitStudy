package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import controller.EmployeeController;
import model.Contract;
import model.Employee;
import model.EmployeeModel;
import view.EmployeeView;

public class Test {
	public static void main(String[] args) {
		EmployeeModel model = new EmployeeModel();
		EmployeeController control = new EmployeeController(model);
		EmployeeView view = new EmployeeView(control);
		view.showView();


		
		
	}
}
