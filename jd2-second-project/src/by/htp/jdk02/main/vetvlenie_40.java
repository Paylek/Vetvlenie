package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_40 {

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

	if (x <= 13) {
		return (- (x * x * x) + 9);
	}
	else {
			return (- 3 / (x + 1));
	}
   
}

public static void print(double x) {
	
	System.out.print("x = " + x);
	
}

}