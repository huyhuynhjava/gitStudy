package validate;

import java.util.Scanner;

public class Validate {
	public static int inputInt(String message) {
		System.out.println( message);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	public static int input(String message,int min, int max) {
		Scanner sc = new Scanner(System.in);
		int n =0;
		while(n<= min || n > max ) {
			System.out.println( message);
			n = sc.nextInt();
		}

		return n;
	}
	public static String input(String messagse) {
		Scanner sc = new Scanner(System.in);
		System.out.println( messagse);
		String a =sc.nextLine();
		return a;
		
	}
	public static int input(String message, int min) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while(a <= 0) {
			System.out.println( message + ">" + min);
			a = sc.nextInt();
		}
		return a;
	}
}
