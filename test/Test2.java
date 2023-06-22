package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		File file = new File("D:\\FileObject\\test.txt");
		Scanner sc= null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
