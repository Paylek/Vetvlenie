package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_33 {

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
    
	if (a == 9583) {
		System.out.print("Доступ А B C");
	}
	else if(a == 1747) {
		System.out.print("Доступ А B C");
	}
	else if (a == 3331) {
		System.out.print("Доступ B C");
	}
	else if (a == 7922) {
		System.out.print("Доступ B C");
	}
	else if (a == 9455) {
		System.out.print("Доступ C");
	}
	else if (a == 8997) {
		System.out.print("Доступ C");
	}
	else {
		System.out.print("Розбийник! Пошел отсюда");
	}
	
  }

}