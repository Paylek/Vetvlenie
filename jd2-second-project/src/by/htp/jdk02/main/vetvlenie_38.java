package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_38 {

public static void main(String args[]) {
	
	double x = 0;
	
	 x = readXFromConsole();
	 
	 x = printResult(x);
	 print(x);
}

public static double readXFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	double x;
	
	System.out.print("Enter x: ");
	x = sc.nextDouble();
	
	return x;
}

public static double printResult(double x) {

	if (x <= 3 && x >= 0) {
		return (x * x);
	}
	else {
			return 4;
	}
   
}

public static void print(double x) {
	
	System.out.print("x = " + x);
	
}

}