package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_32 {

public static void main(String args[]) {
	
	double a = 0, b = 0, c = 0;
	
	 a = readAFromConsole();
	 b = readBFromConsole();
	 c = readCFromConsole();
	 
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

public static void printResult(double a, double b, double c) {
    
	if(a + b > 0) {
		System.out.println("Сумма существует");
	}
	else if (a + c > 0) {
		System.out.println("Сумма существует");
	}
	else if (b + c > 0) {
		System.out.println("Сумма существует");
	}
	else {
		System.out.println("Сумма НЕ существует");
	}

  }
}