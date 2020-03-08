package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_27 {

public static void main(String args[]) {
	
	double a = 0, b = 0, c = 0, d = 0;
	
	 a = readAFromConsole();
	 b = readBFromConsole();
	 c = readCFromConsole();
	 d = readCFromConsole();
	 
	 a = printResult_01(a, b);
	 c = printResult_02(c, d);
	 
	 a = printResult(a, c);
	 print(a);
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

public static double readDFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double d;
	
	System.out.print("Enter d: ");
	d = sc.nextDouble();
	
	return d;
}

public static double printResult_01(double a, double b) {
    
	if (a > b) {
		return b;
	}
	else {
		return a;
	}
	
  }

public static double printResult_02(double c, double d) {
    
	if (c > d) {
		return d;
	}
	else {
		return c;
	}
	
  }

public static double printResult(double a, double c) {
    
	if (a > c) {
		return a;
	}
	else {
		return c;
	}
	
  }

public static void print(double a) {
	System.out.println("Максимальый элемент  " + a);
}

}