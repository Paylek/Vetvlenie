package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_10 {

public static void main(String args[]) {
	
	double x = 0, y = 0;
	
	 x = readXFromConsole();
	 y = readYFromConsole();
	 
	 x = Plochad_01Result(x);
	 y = Plochad_02Result(y);
	 
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

public static double Plochad_01Result(double x) {
    
	x = 3.1428 * x * x;
	
	return x;
	
  }

public static double Plochad_02Result(double y) {
    
	y = 3.1428 * y * y;
	
	return y;
	
  }

public static void printResult(double x, double y) {
    
	if (x > y) {
		 System.out.println("Площадь наименьшая: у"); 
	}
	else {
		System.out.println("Площадь наименьшая: x"); 
	}
	
  }

}