package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_14 {

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
    
	if(x + y < 180 && x + y == 90) {
		
		System.out.println("Треугольник прямоугольный"); 
		
	}
	else if (x + y < 180 && x + y != 90) {
		
		System.out.println("Треугольник НЕпрямоугольный"); 
		
	}
	else {
		
		System.out.println("Треугольника не существует"); 
		
	}
}
}