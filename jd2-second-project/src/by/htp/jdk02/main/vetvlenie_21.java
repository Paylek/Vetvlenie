package by.htp.jdk02.main;

import java.util.Scanner;

public class vetvlenie_21 {

	public static void main(String[] args) {
		  
		  String temp;
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("��� ��: ������� ��� �������? ����� � ��� �: ");
		  
		  /*
		   
		  String input = sc.nextLine();
		  
		 
		  while(!(input.equalsIgnoreCase("�") || input.equalsIgnoreCase("�"))) {
		   
		   System.out.print("���������� �������� - � ��� �. �������� ��� ���. ����� � ��� �: ");
		   
		   sc.next();
		   
		   
		  }
		  
		  */

		  
		  temp = sc.nextLine();
		  
		  
		  String answer;
		  
		  answer = temp.toLowerCase();
		  
		  sc.close();
		  
		  
		  
		  switch(answer) {
		  
		  case "�":
		   System.out.print("��� �������� �������!");
		   break;
		   
		  case "�":
		   System.out.print("��� �������� ��������!");
		   break;
		   
		  default:
		   System.out.print("������� �������� ��������");
		   
		  }
		  
		  }

}