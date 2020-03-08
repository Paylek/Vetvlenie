package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_03 {

public static void main(String args[]) {
	
	double a = 0;
	
	 a = readAFromConsole();
	 
	 printResult(a);
}

public static double readAFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double a;
	
	System.out.print("Enter a: ");
	a = sc.nextDouble();
	
	return a;
}

public static void printResult(double a) {
    
	if (a < 3) {
		 System.out.println("yes"); 
	}
	else {
		System.out.println("no"); 
	}
	
  }

}