package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_31 {

public static void main(String args[]) {
	
	double a = 0, b = 0, x = 0, y = 0, z = 0;
	
	 a = readAFromConsole();
	 b = readBFromConsole();
	 x = readXFromConsole1();
	 y = readYFromConsole();
	 z = readZFromConsole();
	 
	 printResult(a, b, x, y, z);
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

public static double readXFromConsole1() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x;
	
	System.out.print("Enter x: ");
	x = sc.nextDouble();
	
	return x;
}

public static double readYFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double y;
	
	System.out.print("Enter y: ");
	y = sc.nextDouble();
	
	return y;
}

public static double readZFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double z;
	
	System.out.print("Enter z: ");
	z = sc.nextDouble();
	
	return z;
}

public static void printResult(double a, double b, double x, double y, double z) {
    
	if (((a > x) && (b > y)) || ((a > x) && (b > z)) ||  ((a > z) && (b > y))) {
		
		System.out.print("Кирпич пролез");
		
	}
	else {
		System.out.print("Кирпич не пролезет");
	}
	
}

}