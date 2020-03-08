package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_07 {

public static void main(String args[]) {
	
	double x = 0, a = 0, b = 0, c = 0, z = 0;
	
	 x = readXFromConsole();
	 a = readAFromConsole();
	 b = readBFromConsole();
	 c = readCFromConsole();
	 
	 printResult(x, a, b, c, z);
}

public static double readXFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x;
	
	System.out.print("Enter x: ");
	x = sc.nextDouble();
	
	return x;
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

public static void printResult(double x, double a, double b, double c, double z) {
	
	z = a * x * x + b * x + c;
    
	System.out.println("Решение системы a * x * x + b * x + c = " + z); 
  }

}