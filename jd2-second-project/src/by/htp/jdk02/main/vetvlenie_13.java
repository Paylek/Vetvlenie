package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_13 {

public static void main(String args[]) {
	
	double x1 = 0, y1 = 0, y2 = 0, x2 = 0;
	
	 x1 = readX1FromConsole();
	 y1 = readY1FromConsole();
	 x2 = readX2FromConsole();
	 y2 = readY2FromConsole();
	 
	 x1 = Dlina_01Result(x1, y1);
	 x2 = Dlina_02Result(x2, y2);
	 
	 printResult(x1, x2);
}

public static double readX1FromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x1;
	
	System.out.print("Enter x: ");
	x1 = sc.nextDouble();
	
	return x1;
}

public static double readY1FromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double y1;
	
	System.out.print("Enter y: ");
	y1 = sc.nextDouble();
	
	return y1;
}

public static double readX2FromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x2;
	
	System.out.print("Enter x: ");
	x2 = sc.nextDouble();
	
	return x2;
}

public static double readY2FromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double y2;
	
	System.out.print("Enter y: ");
	y2 = sc.nextDouble();
	
	return y2;
}

public static double Dlina_01Result(double x1, double y1) {
    
	x1 = Math.pow(x1 * x1 + y1 * y1, 1 / 2.);
	
	return x1;
	
  }

public static double Dlina_02Result(double x2, double y2) {
    
	x2 = Math.pow(x2 * x2 + y2 * y2, 1 / 2.);
	
	return x2;
	
  }

public static void printResult(double x1, double x2) {
    
	if (x1 > x2) {
		 System.out.println("Точка B ближе чем точка A"); 
	}
	else {
		System.out.println("Точка А ближе чем точка B"); 
	}
	
  }

}