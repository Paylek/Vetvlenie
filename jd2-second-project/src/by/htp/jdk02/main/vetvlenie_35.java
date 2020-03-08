package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_35 {

public static void main(String args[]) {
	
	double x = 0;
	
	 x = readXFromConsole();
	 
	 printResult(x);
}

public static double readXFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x;
	
	System.out.print("Введите день: ");
	x = sc.nextDouble();
	
	return x;
}

public static void printResult(double x) {
    
	if(x >= 1 && x <= 31) {
		System.out.print(x + " Января"); 
	}
	else if (x >= 32 && x <= 59) {
		System.out.print(x - 31 + " Февраля"); 
	}
	else if (x >= 60 && x <= 90) {
		System.out.print(x - 59 + " Марта"); 
	}
	else if (x >= 91 && x <= 120) {
		System.out.print(x - 90 + " Апреля"); 
	}
	else if (x >= 121 && x <= 151) {
		System.out.print(x - 120 + " Мая"); 
	}
	else if (x >= 152 && x <= 181) {
		System.out.print(x - 151 + " Июня"); 
	}
	else if (x >= 182 && x <= 212) {
		System.out.print(x - 31 + " Июля"); 
	}
	else if (x >= 213 && x <= 243) {
		System.out.print(x - 31 + " Августа"); 
	}
	else if (x >= 244 && x <= 273) {
		System.out.print(x - 243 + " Сентября"); 
	}
	else if (x >= 274 && x <= 304) {
		System.out.print(x - 31 + " Октября"); 
	}
	else if (x >= 305 && x <= 334) {
		System.out.print(x - 304 + " Ноября"); 
	}
	else if (x >= 335 && x <= 365) {
		System.out.print(x - 334 + " Августа"); 
	}
	else {
		System.out.print("Ввели не то значение дня"); 
	}
  }

}