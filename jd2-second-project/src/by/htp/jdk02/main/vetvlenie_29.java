package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_29 {

public static void main(String args[]) {
	
	double x1 = 0, x2 = 0, x3 = 0, y1 = 0, y2 = 0, y3 = 0;
	
	 x1 = readX1FromConsole();
	 x2 = readX2FromConsole();
	 x3 = readX3FromConsole1();
	 y1 = readY1FromConsole();
	 y2 = readY2FromConsole();
	 y3 = readY3FromConsole();
	 
	 printResult(x1, x2, x3, y1, y2, y3);
}

public static double readX1FromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x1;
	
	System.out.print("Enter x1: ");
	x1 = sc.nextDouble();
	
	return x1;
}

public static double readX2FromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x2;
	
	System.out.print("Enter x2: ");
	x2 = sc.nextDouble();
	
	return x2;
}

public static double readX3FromConsole1() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x3;
	
	System.out.print("Enter x3: ");
	x3 = sc.nextDouble();
	
	return x3;
}

public static double readY1FromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double y1;
	
	System.out.print("Enter y1: ");
	y1 = sc.nextDouble();
	
	return y1;
}

public static double readY2FromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double y2;
	
	System.out.print("Enter y2: ");
	y2 = sc.nextDouble();
	
	return y2;
}

public static double readY3FromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double y3;
	
	System.out.print("Enter y3: ");
	y3 = sc.nextDouble();
	
	return y3;
}

public static void printResult(double x1, double x2, double x3, double y1, double y2, double y3) {
    if ((x1 / y1) == (x2 / y2) && (x1 / y1) == (x3 / y3) && (x3 / y3) == (x2 / y2)) {
    	System.out.println("Точки лежат на одной прямой");
    }
    else {
    	System.out.println("Точки не лежат на одной прямой");
    }
	
}

}