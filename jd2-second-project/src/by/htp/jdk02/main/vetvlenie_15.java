package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_15 {

public static void main(String args[]) {
	
	double x = 0, y = 0, z, q;
	
	 x = readXFromConsole();
	 y = readYFromConsole();
	 z = x;
	 q = y;
	 
	 x = Preobrazovanie_01Result(x, y);
	 y = Preobrazovanie_02Result(z, y);
	 
	 printResult(z, q, x, y);
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

public static double Preobrazovanie_01Result(double x, double y) {
    
	x = (x + y) / 2;
	
	return x;
	
  }

public static double Preobrazovanie_02Result(double z, double y) {
    
	y = z * y * 2;
	
	return y;
	
  }

public static void printResult(double z, double q, double x, double y) {
    
	if (z > q) {
		
		 System.out.println("y = " + x); 
		 System.out.println("x = " + y); 
		 
	}
	
	else {
		
		System.out.println("x = " + x); 
		System.out.println("y = " + y); 
		
	}
	
  }

}