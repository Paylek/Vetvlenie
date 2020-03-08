package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_26 {

public static void main(String args[]) {
	
	int x = 0, a = 0, b = 0, c = 0;
	
	 x = readXFromConsole();
	 a = printPreobrA(x, a);
	 b = printPreobrB(x, a, b);
	 c = printPreobrC(x, a, b, c);
	 
	 printResult(a, b, c);
}

public static int readXFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	int x;
	
	System.out.print("Enter x: ");
	x = sc.nextInt();
	
	return x;
}

public static int printPreobrA(int x, int a) {
	
	a = (x / 100);

	return a;
}

public static int printPreobrB(int x, int a, int b) {
	
    b = (x - (a * 100)) / 10;
    
    return b;
}

public static int printPreobrC(int x, int a, int b, int c) {
	
    c = (x - (a * 100) - (b * 10));
    
	return c;
}

public static void printResult(int a, int b, int c) {

    if (a > b && a > c && b > c) {
    	
    	b = a + c;
    	System.out.println("Сумма " + b);
    }
    else if (a > b && a > c && b < c) {
    	
    	c = a + b;
    	System.out.println("Сумма " + c);
    }
    else if (a < b && a < c && b < c) {
    	
    	b = a + c;
    	System.out.println("Сумма " + b);
    }
    else if (a > b && a < c && b < c) {
    	
    	a = c + b;
    	System.out.println("Сумма " + a);
    }
    else if (a < b && a > c && b > c) {
    	
    	a = c + b;
    	System.out.println("Сумма " + a);
    }
else if (a < b && a < c && b > c) {
    	
    	c = a + b;
    	System.out.println("Сумма " + c);
    }
}
}