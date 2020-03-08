package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_09 {

public static void main(String args[]) {
	
	double x = 0, y = 0, c = 0;
	
	 x = readXFromConsole();
	 y = readYFromConsole();
	 c = readCFromConsole();
	 
	 printResult(x, y, c);
}

public static double readXFromConsole() {
	
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

public static double readCFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double c;
	
	System.out.print("Enter c: ");
	c = sc.nextDouble();
	
	return c;
}

public static void printResult(double x, double y, double c) {
    
	if (x == y && x == c && y == c) {
		 System.out.println("Треугольник равносторонний"); 
	}
	else {
		System.out.println("Треугольник НЕравносторонний"); 
	}
	}
	
  }