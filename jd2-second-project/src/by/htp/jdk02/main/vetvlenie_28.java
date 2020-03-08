package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_28 {

public static void main(String args[]) {
	
	double a = 0, b = 0, c = 0, d = 0;
	
	 a = readAFromConsole();
	 b = readBFromConsole();
	 c = readCFromConsole();
	 d = readCFromConsole();
	 
	 a = printResult(a, b, c, d);
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


public static double printResult(double a, double b, double c, double d) {
    
	if (a == d) {
		return a;
	}
	else if(b == d) {
		return b;
	}
	else if (c == d) {
		return c;
	}
	else {
		return printResult_01(a, b, c, d);
	}
	
  }

public static void print(double a) {
	System.out.println("Максимальый элемент  " + a);
}

public static double printResult_01(double a, double b, double c, double d) {
    
	if (a > b && a > c && a > d) {
		return a;
	}
	else if (a < b && b  > c && b > d) {
		return d;
	}
	else if (a < c && b < c && c > d) {
		return c;
	}
	else {
		return d;
	}
	
  }



}