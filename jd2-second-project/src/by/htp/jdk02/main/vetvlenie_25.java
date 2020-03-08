package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_25 {

public static void main(String args[]) {
	
	double x = 0;
	
	 x = readXFromConsole();
	 
	 printResult(x);
}

public static double readXFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x;
	
	System.out.print("Enter x: ");
	x = sc.nextDouble();
	
	return x;
}

public static void printResult(double x) {
    
	if (x >= 60) {
		 System.out.println("Боже бегите!!! Мы все умрем"); 
	}
	else {
		System.out.println("Спокойно. Все под контролем"); 
	}
	
  }

}