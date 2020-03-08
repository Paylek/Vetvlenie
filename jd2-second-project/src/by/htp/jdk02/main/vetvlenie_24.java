package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_24 {

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
    
	if (x % 2 == 0) {
		 System.out.println("Он тебя НЕ любит! Забудь его наконец-то"); 
	}
	else {
		System.out.println("Конечно он тебя любит! Как это нельзя заметить я не понимаю?!"); 
	}
	
  }

}