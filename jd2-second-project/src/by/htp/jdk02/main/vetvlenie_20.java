package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_20 {

public static void main(String args[]) {
	
	double k = 0, a = 0, b = 0, c = 0;
	
	 k = readKFromConsole();
	 a = readAFromConsole();
	 b = readBFromConsole();
	 c = readCFromConsole();
	 
	 printResult(k, a, b, c);
}

public static double readKFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double k;
	
	System.out.print("Enter k: ");
	k = sc.nextDouble();
	
	return k;
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

public static void printResult(double k, double a, double b, double c) {
	
	if (a % k == 0 && b % k == 0 && c % k == 0) {
		System.out.print("a = " + a + " b = " + b + " c = " + c); 
	}
	else if (a % k != 0 && b % k == 0 && c % k == 0) {
		System.out.print(" b = " + b + " c = " + c); 
	}
	else if (a % k == 0 && b % k != 0 && c % k == 0) {
	System.out.print("a = " + a + " c = " + c); 
	}
	else if (a % k == 0 && b % k == 0 && c % k != 0) {
	System.out.print("a = " + a + " b = " + b); 
	}
	else if (a % k != 0 && b % k != 0 && c % k == 0) {
	System.out.print(" c = " + c); 
	}
	else if (a % k != 0 && b % k == 0 && c % k != 0) {
		System.out.print(" b = " + b); 
	}
	else if (a % k == 0 && b % k != 0 && c % k != 0) {
		System.out.print("a = " + a); 
		
	}
	else if (a / k != 0 && b / k != 0 && c / k != 0) {
		System.out.print("Делителей нет"); 
	}
	}

}