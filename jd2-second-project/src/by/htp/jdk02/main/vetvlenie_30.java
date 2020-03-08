package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_30 {

public static void main(String args[]) {
	
	double a = 0, b = 0, c = 0;
	
	 a = readAFromConsole();
	 b = readBFromConsole();
	 c = readCFromConsole();

	 a = printResult01(a, b, c);
	 b = printResult02(a, b, c);
	 c = printResult03(a, b, c);
	 
	 print(a, b, c);
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

public static double printResult01(double a, double b, double c) {
 
	if(a > b && a > c && b > c) {
		return a = a * 2;
	}
	else {
		return (int)a;
	}
	
}

public static double printResult02(double a, double b, double c) {
	 
	if(a > b && a > c && b > c) {
		return b = b * 2;
	}
	else {
		return (int)b;
	}
	
}

public static double printResult03(double a, double b, double c) {
	 
	if(a > b && a > c && b > c) {
		return c = c * 2;
	}
	else {
		return (int)c;
	}
	
}

public static void print(double a, double b, double c) {
	System.out.println("a = " + a + " b = "+ b + " c = "+ c);
}
}