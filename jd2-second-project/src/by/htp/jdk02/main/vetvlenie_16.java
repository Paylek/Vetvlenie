package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_16 {

public static void main(String args[]) {
	
	double x = 0, y = 0;
	
	 x = readXFromConsole();
	 y = readYFromConsole();
	  
	 printResult(x, y);
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

public static void printResult(double x, double y) {
    
	if (x == 0 && y == 0) {
		 System.out.println("В точке О"); 
	}
	else if (x > 0 && y == 0 ) {
		System.out.println("Между 1 и 4 четвертью"); 
	}
	else if (x < 0 && y == 0 ) {
		System.out.println("Между 2 и 3 четвертью"); 
	}
	else if (x == 0 && y > 0 ) {
		System.out.println("Между 1 и 2 четвертью"); 
	}
	else if (x == 0 && y < 0 ) {
		System.out.println("Между 3 и 4 четвертью"); 
	}
	else if (x > 0 && y > 0 ) {
		System.out.println("В 1 четверти"); 
	}
	else if (x > 0 && y < 0 ) {
		System.out.println("В 4 четверти"); 
	}
	else if (x < 0 && y > 0 ) {
		System.out.println("В 2 четверти"); 
	}
	else if (x < 0 && y < 0 ) {
		System.out.println("В 3 четверти"); 
	}
	
  }

}