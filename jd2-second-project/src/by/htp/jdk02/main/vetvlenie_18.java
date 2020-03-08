package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_18 {

public static void main(String args[]) {
	
	double a = 0, b = 0, c = 0, z = 0;
	
	 a = readAFromConsole();
	 b = readBFromConsole();
	 c = readCFromConsole();
	 
	 printResult(a, b, c, z);
}

public static double readAFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double a;
	
	System.out.print("Enter a: ");
	a = sc.nextDouble();
	
	return a;
}

public static double readBFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double b;
	
	System.out.print("Enter b: ");
	b = sc.nextDouble();
	
	return b;
}

public static double readCFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double c;
	
	System.out.print("Enter c: ");
	c = sc.nextDouble();
	
	return c;
}

public static void printResult(double a, double b, double c, double z) {
	
	if(a > 0 && b > 0 && c > 0) {
		z = 0;
	}
	else if (a > 0 && b > 0 && c < 0) {
		z = 1;
	}
	else if (a > 0 && b < 0 && c < 0) {
		z = 2;
	}
	else if (a < 0 && b < 0 && c < 0) {
		z = 3;
	}
	else if (a < 0 && b > 0 && c < 0) {
		z = 2;
	}
	else if (a > 0 && b < 0 && c > 0) {
		z = 1;
	}
	else if (a < 0 && b > 0 && c > 0) {
		z = 1;
	}
	else if (a < 0 && b < 0 && c > 0) {
		z = 2;
	}
	
	System.out.println("количество отрицательных: " + z); 
  }

}