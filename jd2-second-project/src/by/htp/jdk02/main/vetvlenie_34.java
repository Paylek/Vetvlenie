package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_34 {

public static void main(String args[]) {
	
	int x = 0, a = 0, c = 0;
	
	 x = readXFromConsole();
	 a = readAFromConsole();
	 c = Math.abs(x - a);
	 
	 printResult(x, a, c);
}

public static int readXFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	int x;
	
	System.out.print("������� ��������� ����: ");
	x = sc.nextInt();
	
	return x;
}

public static int readAFromConsole() {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	int a;
	
	System.out.print("����� �����: ");
	a = sc.nextInt();
	
	return a;
}

public static void printResult(int x, int a, int c) {

	if (x - a == 0) {
		System.out.print("�������!");
	}
	else if (x - a < 0) {
		System.out.print("�������� ����� " + c + " ������");
	}
	else if (x - a > 0) {
		System.out.print("��������� " + c + " ������");
	}
   
}
}