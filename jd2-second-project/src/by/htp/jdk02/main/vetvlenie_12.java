package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_12 {

public static void main(String args[]) {
	
	double a = 0, b = 0, c = 0;
	
	 a = readAFromConsole();
	 b = readBFromConsole();
	 c = readCFromConsole();
	 
	 a = Preobrazovanie_01Result(a);
	 b = Preobrazovanie_02Result(b);
	 c = Preobrazovanie_03Result(c);
	 
	 printResult(a, b, c);
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

public static double Preobrazovanie_01Result(double a) {
    
	if (a > 0) {
		a = a * a;
	}
	else {
		a = Math.pow(a, 4);
	}
	
	return a;
	
  }

public static double Preobrazovanie_02Result(double b) {
    
	if (b > 0) {
		b = b * b;
	}
	else {
		b = Math.pow(b, 4);
	}
	
	return b;
	
  }

public static double Preobrazovanie_03Result(double c) {
    
	if (c > 0) {
		c = c * c;
	}
	else {
		c = Math.pow(c, 4);
	}
	
	return c;
	
  }

public static void printResult(double a, double b, double c) {
	
	System.out.println("a = " + a + " b = " + b + " c = " + c); 
	
  }

}