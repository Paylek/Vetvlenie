package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_22 {

public static void main(String args[]) {
	
	double x = 0, y = 0, z = 0;
	
	 x = readXFromConsole();
	 z = x;
	 y = readYFromConsole();
	 
	 
	 printResult(x, y, z);
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

public static void printResult(double x, double y, double z) {
    
	if (x >= y) {
		
		System.out.print("x = " + x + " y = " + y); 
		
	}
	else if  (x < y) {
		
		x = y;
		y = z;
		System.out.print("x = " + x + " y = " + y); 
		
	}
	
  }

}