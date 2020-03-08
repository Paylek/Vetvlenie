package by.htp.jdk02.main;

import java.util.Scanner;
import java.util.InputMismatchException;

@SuppressWarnings("unused")
public class vetvlenie_08 {

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
    
	if (x * x > y * y) {
		 System.out.println("���������� ����� y"); 
	}
	else {
		System.out.println("���������� ����� x"); 
	}
	
  }

}