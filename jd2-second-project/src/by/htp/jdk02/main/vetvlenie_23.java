package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_23 {

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
	
	System.out.print("Введите месяц (от 1 до 12) x: ");
	x = sc.nextDouble();
	
	return x;
}

public static double readYFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double y;
	
	System.out.print("Введите число (от 1 до 31) y: ");
	y = sc.nextDouble();
	
	return y;
}

public static void printResult(double x, double y) {
    
	if(x == 1 && y >= 32 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 2 && y >= 29 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 3 && y >= 32 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 4 && y >= 31 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 5 && y >= 32 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 6 && y >= 31 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 7 && y >= 32 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 8 && y >= 32 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 9 && y >= 31 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 10 && y >= 32 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 11 && y >= 31 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else if (x == 12 && y >= 32 && y <= 0) {
		System.out.print("Дата введена неверно"); 
	}
	else {
		System.out.print("Дата введена верно"); 
	}
	
  }

}